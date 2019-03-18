package com.greenfoxacademy.restbackend.Controller;

import com.greenfoxacademy.restbackend.Model.CustomError;
import com.greenfoxacademy.restbackend.Model.Doubling;
import com.greenfoxacademy.restbackend.Model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping(value = "/doubling")
    public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
            return new Doubling(input);
        } else {
            return new CustomError("Please provide an input!");
        }
    }

    @GetMapping(value = "/greeter")
    public Object Greeting(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
        if (name != null && title != null) {
            return new Greeting("Oh, hi there " + name + ", my dear " + title + "!");
        } else if (name == null && title == null) {
            return new CustomError("Please provide a name and a title!");
        } else if (name == null) {
            return new CustomError("Please provide a name!");
        } else return new CustomError("Please provide a title!");
    }
}
