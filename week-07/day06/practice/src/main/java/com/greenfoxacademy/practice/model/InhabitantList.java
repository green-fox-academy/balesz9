package com.greenfoxacademy.practice.model;

import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Component
public class InhabitantList {

    private List<Inhabitant> inhabitantList;

    public InhabitantList() {
        this.inhabitantList = new ArrayList<>();
        initializeList();
    }

    public List<Inhabitant> getInhabitantList() {
        return inhabitantList;
    }

    public void initializeList(){
        inhabitantList.add(new Inhabitant("Micimacko", 10, Gender.MALE));
        inhabitantList.add(new Inhabitant("Malacka", 5, Gender.FEMALE));

    }

    public Inhabitant selectInhabitantById (int id){

        for(Inhabitant inhabitant : inhabitantList) {
            if (inhabitant.getId() == id) {
                return inhabitant;
            }
        }
        return null;
    }
}
