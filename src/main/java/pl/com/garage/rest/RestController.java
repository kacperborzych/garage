package pl.com.garage.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.com.garage.model.Client;
import pl.com.garage.service.ClientService;

import java.awt.*;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/rest")
public class RestController {

    @Autowired
    public ClientService clientService;

    public RestController() {
        System.out.println("test");
    }

    @RequestMapping(value = "/list")
    public List<Client> clientList(){
        return clientService.findAllClient();
    }

    @RequestMapping(value = "/save2/{name}/{price}")
    public String saveClient(@RequestParam String name, @RequestParam String model){
        clientService.addClient(name, model);
        return "Zapisano imie: " + name + " " + model;
    }

    @RequestMapping(value = "/delete/{name}", method = RequestMethod.DELETE)
    public void deleteClient(@RequestParam String name){
        clientService.delateClient(name);
        System.out.println("Usunieto klienta " + name );
    }

}
