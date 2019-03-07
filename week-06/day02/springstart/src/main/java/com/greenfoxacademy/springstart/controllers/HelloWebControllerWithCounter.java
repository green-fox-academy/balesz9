package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebControllerWithCounter {

    static AtomicLong id = new AtomicLong(1);

    @RequestMapping("/web/greeting2")
    public String greeting(Model model, @RequestParam(value = "name", required = false) String name) {
        model.addAttribute("name", name);
        model.addAttribute("id",id.getAndAdd(1));
        return "greeting2";
    }

}

