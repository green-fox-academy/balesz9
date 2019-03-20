package com.greenfoxacademy.hellobeanworld;

import org.springframework.stereotype.Service;

@Service(value = "Green Color")
public class GreenColor implements MyColor {


    @Override
    public void printColor(){

        System.out.println("This is green color");
    }
}
