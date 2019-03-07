package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.concurrent.atomic.AtomicLong;

@Controller
public class RandomHelloWebController {


    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    static AtomicLong id = new AtomicLong(1);

    @RequestMapping("/web/greeting3")
    public String greeting(Model model, @RequestParam(value = "name", required = false) String name) {
        String color = "rgb("+(int)(Math.random() * 256)+","
                             + (int)(Math.random() * 256)+","
                             + (int)(Math.random() * 256)+")";

        model.addAttribute("hello", hellos[(int)(Math.random() * hellos.length )]);
        model.addAttribute("name", name);
        model.addAttribute("id",id.getAndAdd(1));
        model.addAttribute("fontSize",(int)(Math.random() * 50 + 5));
        model.addAttribute("color",color);

        return "greeting3";
    }

}