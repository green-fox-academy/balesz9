package com.greenfoxacademy.bankofsimba;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankOfSimbaController {

    private BankAccount simbaAccount = new BankAccount("Simba",2000.15, "lion");

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public BankOfSimbaController() {
        bankAccounts.add(new BankAccount("Simba", 2000.00, "lion"));
    }

    @RequestMapping(path = "/simba", method = RequestMethod.GET)
    public String showBankAccount(Model model) {
        model.addAttribute("simbaAccount", simbaAccount);
        return "simba";
    }

    @RequestMapping(path = "/html", method = RequestMethod.GET)
    public String showString(Model model) {
        model.addAttribute("string","This is an <em>HTML</em> text. <b>Enjoy yourself!</b>" );
        return "html";
    }


    @RequestMapping(path = "/showaccounts", method = RequestMethod.GET)
    public String showBankAccounts(Model model) {
        model.addAttribute("bankAccounts", bankAccounts);
        return "accounts";
    }


}
