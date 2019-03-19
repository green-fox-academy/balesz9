package com.greenfoxacademy.restbackend.controller;

import com.greenfoxacademy.restbackend.model.*;
import com.greenfoxacademy.restbackend.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ApiController {

    @Autowired
    private MyService service;

    @GetMapping(value = "/doubling")
    public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
            return new Doubling(input);
        } else {
            return new CustomError("Please provide an input!");
        }
    }

    @GetMapping(value = "/greeter")
    public Object greeting(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
        if ((name != null && name.length()>0)   && (title != null && title.length()>0) ) {
            return new Greeting("Oh, hi there " + name + ", my dear " + title + "!");
        } else if ((name == null || name.length()== 0 )&& (title == null|| title.length() == 0 )) {
            return new CustomError("Please provide a name and a title!");
        } else if (name == null || name.length()==0) {
            return new CustomError("Please provide a name!");
        } else return new CustomError("Please provide a title!");
    }

    @GetMapping(value = "/appenda/{appendable}")
    public Object appendingA(@PathVariable(name = "appendable", required = false) String appendable) {
        return new Append(appendable);
    }

    @PostMapping("dountil/{action}")
    public Object returnDoUntil(@PathVariable("action") String action, @RequestBody(required = false) Map<String, Integer> until) {
        DoUntil doUntil = new DoUntil();
        if (until == null) {
            return new CustomError("Please provide a number!");
        } else {
            doUntil.setResult(action, until.get("until"));
            return doUntil;
        }
    }

    @PostMapping("arrays")
    public Object returnHandler(@RequestBody(required = false) ArrayObject arrayObject) {
        if (arrayObject.getNumbers()== null){
            return new CustomError("Please provide a number!");
        } else if (arrayObject.getWhat().equals("sum")){
            return service.sumOfNumbers(arrayObject.getNumbers());
        } else if (arrayObject.getWhat().equals("multiply")){
            return service.multiplyNumbers(arrayObject.getNumbers());
        } else if (arrayObject.getWhat().equals("double")){
            return service.doubleNumbers(arrayObject.getNumbers());
        } return new CustomError("Please provide what to do with numbers.");
    }
}


