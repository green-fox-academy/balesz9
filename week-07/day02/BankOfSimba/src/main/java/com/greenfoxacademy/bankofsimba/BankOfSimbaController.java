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

    private BankAccount simbaAccount = new BankAccount("Simba",2000, "lion");

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public BankOfSimbaController() {
        bankAccounts.add(new BankAccount("Simba", 2000, "lion"));
    }

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String showBankAccount(Model model) {
        model.addAttribute("simbaAccount", simbaAccount);
        return "simba";
    }


    @RequestMapping(path = "/showaccounts", method = RequestMethod.GET)
    public String showBankAccounts(Model model) {
        model.addAttribute("bankAccounts", bankAccounts);
        return "accounts";
    }


}
