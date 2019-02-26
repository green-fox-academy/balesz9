package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import com.greenfoxacademy.springstart.SpringstartApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    public static void main(String[] args) {
        SpringApplication.run(SpringstartApplication.class, args);
    }

    @RequestMapping(value="/greeting")
    public static Greeting greeting(){
        Greeting greeting = new Greeting(1,"Hello, world!");
        return greeting;
    }
}
