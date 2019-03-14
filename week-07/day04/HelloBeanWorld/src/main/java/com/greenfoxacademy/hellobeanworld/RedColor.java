package com.greenfoxacademy.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service (value = "Red Color")
public class RedColor implements MyColor {

    private Printer printer;

    @Autowired
    public RedColor(Printer printer){
        this.printer = printer;
    }

    @Override
    public void printColor(){
        printer.log("This is red color");
    }
}
