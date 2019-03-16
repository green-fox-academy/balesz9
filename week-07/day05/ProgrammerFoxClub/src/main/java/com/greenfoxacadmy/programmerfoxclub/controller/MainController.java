package com.greenfoxacadmy.programmerfoxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(path = "/")
    public String getMainPage(){
        return "index";
    }

}
