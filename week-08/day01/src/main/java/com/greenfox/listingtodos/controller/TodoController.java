package com.greenfox.listingtodos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value= "/todo", method = RequestMethod.GET)
public class TodoController {


    @ResponseBody
    @RequestMapping(value={"/", "list"},method = RequestMethod.GET)
    public String list(){
        return "This is my first Todo";
    }

}
