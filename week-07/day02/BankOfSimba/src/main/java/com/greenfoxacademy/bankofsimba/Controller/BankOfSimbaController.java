package com.greenfoxacademy.bankofsimba.Controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankOfSimbaController {

    private BankAccount simbaAccount = new BankAccount("Simba",2000.00, "lion", true,false);

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public BankOfSimbaController() {
        bankAccounts.add(new BankAccount("Simba", 2000.00, "lion",true,false));
        bankAccounts.add(new BankAccount("Timon", 5000.00, "meerkat",false,false));
        bankAccounts.add(new BankAccount("Pumba", 3000.00, "warthog",false,false));
        bankAccounts.add(new BankAccount("Rafiki", 2000.00, "mandrill",false,true));
        bankAccounts.add(new BankAccount("Zazu", 2000.00, "hornbill",false,false));
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


    @RequestMapping(path = "/accounts", method = RequestMethod.GET)
    public String showBankAccounts(Model model, @ModelAttribute(name="newBankAccount") BankAccount bankAccount) {
        model.addAttribute("bankAccounts", bankAccounts);
        model.addAttribute("newBankAccount", new BankAccount());
        return "accounts";
    }

    @PostMapping("/raise")
    public String raiseAccountBalance(Model model, @RequestParam("index") Integer index) {
        this.bankAccounts.get(index).raiseBalance();
        model.addAttribute("bankAccounts", this.bankAccounts);
        return "redirect:/accounts";
    }

    @ModelAttribute(value = "newBankAccount")
    public BankAccount addAccount() {
        return new BankAccount();
    }

    @PostMapping("/add")
    public  String addNewAccounts(BankAccount newBankAccount){
        bankAccounts.add(newBankAccount);
        return "redirect:/accounts";
    }

}
