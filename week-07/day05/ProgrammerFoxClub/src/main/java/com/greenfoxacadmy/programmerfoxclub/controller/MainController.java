package com.greenfoxacadmy.programmerfoxclub.controller;

import com.greenfoxacadmy.programmerfoxclub.model.FoxListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private FoxListService foxListService;

    @Autowired
    public MainController(FoxListService foxListService){
        this.foxListService = foxListService;
    }


    @GetMapping(path = "/")
    public String getMainPage(){
        return "index";
    }

    @GetMapping(path="/login")
    public  String LoginForm(){
        return "login";
    }
    @PostMapping(path="/login")
    public String login(){
        return"redirect:/";
    }

}
