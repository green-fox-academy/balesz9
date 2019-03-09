package com.greenfoxacademy.practice.controller;

import com.greenfoxacademy.practice.model.Gender;
import com.greenfoxacademy.practice.model.Inhabitant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class InhabitantController {

    private List<Inhabitant> inhabitants;

    public InhabitantController(){
        inhabitants = new ArrayList<>();
        inhabitants.add(new Inhabitant("Micimacko",4, Gender.MALE));
        inhabitants.add(new Inhabitant("Malacka",2, Gender.FEMALE));
    }

    @RequestMapping(path = "/", method = RequestMethod.GET) // a path lehet value is, lehet GetMapping is
    public String getMainPage(){
        return "index";
    }

    @RequestMapping(path ="inhabitants", method = RequestMethod.GET)
    public String ShowInhabitants(Model model){
        model.addAttribute("inhabitants", inhabitants);
        return "inhabitant_table";
    }


}
