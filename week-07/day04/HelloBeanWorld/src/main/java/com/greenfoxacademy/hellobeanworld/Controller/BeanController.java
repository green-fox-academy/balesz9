package com.greenfoxacademy.hellobeanworld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BeanController {

    @RequestMapping(path = "/useful", method = RequestMethod.GET)
    public String getMainPage(){
        return "index";
    }
}
