package com.greenfoxacademy.hellobeanworld.Controller;

import com.greenfoxacademy.hellobeanworld.Model.UtilityService;
import com.greenfoxacademy.hellobeanworld.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BeanController {

    private UtilityService utilityService;

    @Autowired
    BeanController (@Qualifier("Utility Service") UtilityService utilityService){
        this.utilityService = utilityService;
    }


    @RequestMapping(path = "/useful", method = RequestMethod.GET)
    public String getMainPage(){
        return "index";
    }

    @RequestMapping(path = "/useful/colored", method = RequestMethod.GET)
    public String coloredPage(Model model){
        model.addAttribute("color",utilityService.randomColor());
        return "colored_page";
    }

   /* @RequestMapping(path = "/useful/email{email}", method = RequestMethod.GET)
    public String emailValidator(Model model, @PathVariable(name="email") String email){
        model.addAttribute("isValid", utilityService.emailValidate(email));
        model.addAttribute("email", email);
        return "email_validation";
    }*/

    @PostMapping(value="useful/email")
    public String email(Model model, @RequestParam("email") String email){
        model.addAttribute("isValid", utilityService.emailValidate(email));
        model.addAttribute("email", email);
        return "email_validation";
    }

    @PostMapping(value="useful/encoder")
    public String encoder(Model model, @RequestParam("text") String text, @RequestParam("shift") int shift){
        model.addAttribute("encoded", utilityService.caesar(text, shift));
        return "encoder";
    }


}
