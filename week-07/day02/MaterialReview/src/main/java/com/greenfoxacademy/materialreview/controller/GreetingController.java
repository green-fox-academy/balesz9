package com.greenfoxacademy.materialreview.controller;

import com.greenfoxacademy.materialreview.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greetingTemplates/greeting";
    }


    // region Explanation:

    // 'greeting' model attribute is populated with data from a form
    // submitted to the greeting endpoint (greeting html).
    // Spring MVC does this behind the scenes before invoking the method.
    // This saves you from having to parse each field individually.
    // This way a "Greeting" object is created just before calling this method.
    // The default constructor (of Greeting) (there must be one) is called, and then
    // Spring checks whether it can set any field (via setters) (there must be setters).
    // It searches the passed data (sent by the form) to see if there is any information
    // matching the fields (in our case there is, like: th:field="*{id}"
    // These will be set via setters

    // endregion
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "greetingTemplates/result";
    }


    // The same as above:
    /*@PostMapping("/greeting")
    public String greetingSubmit(Model model, Greeting greeting) {
        model.addAttribute("greeting", greeting);
        return "greetingTemplates/result";
    }*/
}