package pl.com.garage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @RequestMapping(value = "showEmployeeMenu.html")
    public ModelAndView showEmployeeMenu(){
        return new ModelAndView("employeeViews/employeeMenu");
    }

    @RequestMapping(value = "showClientMenu.html")
    public ModelAndView showClientMenu(){
        return new ModelAndView("clientViews/clientMenu");
    }
}
