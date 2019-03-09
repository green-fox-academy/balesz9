package com.greenfoxacademy.practice.controller;

import com.greenfoxacademy.practice.model.Gender;
import com.greenfoxacademy.practice.model.Inhabitant;
import com.greenfoxacademy.practice.model.InhabitantList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class InhabitantController {

    private InhabitantList inhabitantList;

    @Autowired
    public InhabitantController(InhabitantList inhabitantList){
        this.inhabitantList=inhabitantList;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET) // a path lehet value is, lehet GetMapping is
    public String getMainPage(){
        return "index";
    }

    @RequestMapping(path ="inhabitants", method = RequestMethod.GET)
    public String ShowInhabitants(Model model){
        model.addAttribute("inhabitants", inhabitantList.getInhabitantList() );
        return "inhabitant_table";
    }

    @RequestMapping(path = "/inhabitants/{id}", method = RequestMethod.GET )
    public String getInhabitantById(Model model, @PathVariable(name="id") Integer id){

        Inhabitant inhabitant = inhabitantList.selectInhabitantById(id);

        if (inhabitant != null) {
            model.addAttribute("inhabitant_by_id",inhabitant );
        } else {
            model.addAttribute("error", "No inhabitant found by this id.");
        }

        return "inhabitant_id";
    }


}
