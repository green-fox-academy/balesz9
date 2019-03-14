package com.greenfoxacademy.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

  /*  private Printer printer;

    @Autowired
    HellobeanworldApplication(Printer printer){
        this.printer = printer;
    }
*/
    private MyColor color;

    @Autowired
    HellobeanworldApplication (@Qualifier("Blue Color")MyColor color){
        this.color = color;
    }

    @Override
    public void run(String... args) throws Exception {
        color.printColor();
    }


    public static void main(String[] args) {
        SpringApplication.run(HellobeanworldApplication.class, args);
    }

}
