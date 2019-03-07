package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import com.greenfoxacademy.springstart.SpringstartApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTControllerFromURL {


    static AtomicLong id = new AtomicLong(0);

    @GetMapping(value="/greeting")
    public static Greeting greeting(@RequestParam String name){
        return new Greeting(id.getAndAdd(1),"Hello," + name + " !");
    }
}

