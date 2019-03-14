package com.greenfoxacademy.hellobeanworld;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {
    public void log(String message) {
        System.out.println("Time and date:"+LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
}
