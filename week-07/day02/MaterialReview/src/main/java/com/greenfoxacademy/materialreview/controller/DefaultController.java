package com.greenfoxacademy.materialreview.controller;

import com.greenfoxacademy.materialreview.model.DeveloperResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@ControllerAdvice
public class DefaultController {

    DeveloperResource[] devResources;

    public DefaultController(){

        DeveloperResource[] newResources = {
                new DeveloperResource("Google", "http://www.google.com", true),
                new DeveloperResource("Stackoverflow", "http://www.stackoverflow.com", true),
                new DeveloperResource("W3Schools", "http://www.w3schools.com", false),
                new DeveloperResource("Oracle", "https://docs.oracle.com/javase/8/docs/api/", true),
                new DeveloperResource("Wiki", "http://www.wikipedia.com", true)
        };

        devResources = newResources;
    }

    @RequestMapping("/first")
    public String firstPoint() {
        // Render the first.html (inside templates folder) to "/first" endpoint
        return "defaultTemplates/first";
    }

    @RequestMapping("/second")
    public String secondPoint(Model model) {
        // Render the second.html (inside templates folder) to "/second" endpoint
        // Add two attributes:
        // "name", "Tom"
        // "formatted", "<b>blue</b>"

        model.addAttribute("name", "Tom");
        model.addAttribute("formatted", "<b>blue</b>");

        return "defaultTemplates/second";
    }

    @RequestMapping("/third")
    public String thirdPoint(Model model) {
        // Render the third.html (inside templates folder) to "/third" endpoint
        // Add the devResources attribute:
        model.addAttribute("resources", devResources);

        return "defaultTemplates/third";
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg", "Welcome to the Netherlands!");
    }

    // The controller maps the request for "/requestParam"
    // This method does not refer to a template but provides a body
    // The same as:
    // @RequestMapping("/requestParam")
    // http://localhost:8080/requestParam?id=20&name=Arya%20Stark
    @RequestMapping(value = "/requestParam", method = RequestMethod.GET)
    @ResponseBody
    public String requestParam(@RequestParam int id, String name) {
        // The 'id' and 'name' paramater will be gained from the link
        // Display: "Id: id, & name: name via @RequestParam"

        return "Id" + id + ", name: " + name + "via @RequestParam";
    }

    @RequestMapping(value = "/pathVariable/{id}/and/{name}")
    @ResponseBody
    //http://localhost:8080/pathVariable/1/and/2
    // If the name of the method parameter matches the name of the path variable exactly,
    // then this can be simplified:
    // public String pathVariable(@PathVariable int id, @PathVariable String name) {
    public String pathVariable(@PathVariable("id") int id, @PathVariable String name) {
        // The 'id' and 'name' paramater will be gained from the link
        // Display: "Id: id, & name: name via @RequestParam"
        return "Id" + id + ", name: " + name + "via @RequestParam";
    }

    @RequestMapping("/conditions")
    public String fifthPoint(Model model) {
        // Render the conditions.html (inside templates folder) to "/conditions" endpoint
        // add 5 separate devResources
        model.addAttribute("first", devResources[0]);
        model.addAttribute("second", devResources[1]);
        model.addAttribute("third", devResources[2]);
        model.addAttribute("fourth", devResources[3]);
        model.addAttribute("fifth", devResources[4]);
        // https://www.baeldung.com/spring-thymeleaf-conditionals

        // https://www.baeldung.com/spring-thymeleaf-conditionals
        return "defaultTemplates/conditions";
    }


    @RequestMapping("/all")
    public String getAll(Model model) {
        model.addAttribute("id", 30);
        model.addAttribute("name", "Arya Stark");
        return "all";
    }
}