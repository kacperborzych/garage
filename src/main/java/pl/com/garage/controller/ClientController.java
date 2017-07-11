package pl.com.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
        Client modelObject = new Client();
        modelObject.setCarModel("alfa");
        return new ModelAndView("/clientViews/addClientForm", "client", modelObject);
    }

    @RequestMapping(value = "addClientForm.html", method = RequestMethod.POST)
    public ModelAndView showAddClientForm1(Client client){
        return new ModelAndView("/clientViews/addClientConfirmation", "client", client);
    }


    @RequestMapping(value ="findClientById.html", method = RequestMethod.GET)
    public ModelAndView showFindClientById() {
        ModelAndView modelAndView = new ModelAndView("clientViews/clientFindForm", "client", new Client());
       // modelAndView.addObject(clientService.findClient(id));
        return modelAndView;
    }

    @RequestMapping(value ="findClientById.html", method = RequestMethod.POST)
    public ModelAndView showFindClientById(Client client){
      //  clientService.updateClient(client.getName(), client.getCarModel();
        return new ModelAndView("clientViews/clientFindConfirmation", "client", client);
    }
}
