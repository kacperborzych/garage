package pl.com.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.com.garage.model.Client;
import pl.com.garage.service.ClientService;

@Controller
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(value = "addClientForm.html", method = RequestMethod.GET)
    public ModelAndView showAddClientForm(){
        return new ModelAndView("/clientViews/addClientForm", "client",new Client());
    }
}
