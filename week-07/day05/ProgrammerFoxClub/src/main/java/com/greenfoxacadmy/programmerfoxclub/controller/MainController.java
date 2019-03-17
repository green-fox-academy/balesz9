package com.greenfoxacadmy.programmerfoxclub.controller;

import com.greenfoxacadmy.programmerfoxclub.model.Fox;
import com.greenfoxacadmy.programmerfoxclub.model.FoxListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private FoxListService foxListService;

    @Autowired
    public MainController(FoxListService foxListService){
        this.foxListService = foxListService;
    }

/*    @GetMapping(path = "/")
    public String getMainPage(){
        return "index";
    }*/


    @RequestMapping(path = "/", method = RequestMethod.GET )
    public String getFoxByName(Model model, @RequestParam(value = "name" ,required = false, defaultValue = "Mr. Fox") String name){
        //model.addAttribute("name_index", name);
       Fox fox = foxListService.selectFoxByName(name);

        if (fox != null) {
            model.addAttribute("fox",fox );
        } else {
            model.addAttribute("error", "No fox found by this name.");
        }
        return "index";
    }

    @GetMapping(path="/login")
    public  String loadLogin(){
        return "login";
    }
    @PostMapping(path="/login")
    public String getLoginName(String loginName){ //takes the name variable from the login form
        return "redirect:/?name=" + loginName;
    }

}
