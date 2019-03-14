package com.greenfoxacademy.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "Blue Color")
public class BlueColor implements MyColor {

    private Printer printer;

    @Autowired
    public BlueColor(Printer printer){
        this.printer = printer;
    }

    @Override
    public void printColor(){
        printer.log("This is blue color");
    }
}

