package com.greenfoxacadmy.programmerfoxclub.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoxListService {

    private List<Fox> foxList;

    public List<Fox> getFoxList() {
        return foxList;
    }

    public void addFox(Fox fox){
        foxList.add(fox);
    }

    public FoxListService() {
        this.foxList = new ArrayList<>();
        initializeList();
    }

    public void initializeList(){
        foxList.add(new Fox("Bela", new ArrayList<Trick>(){{
            add(Trick.program);
            add(Trick.backflip);
        }},Food.pizza, Drink.rum ));
        foxList.add(new Fox("Mulder", new ArrayList<Trick>(){{
            add(Trick.fly);
            add(Trick.sing);
        }},Food.pizza, Drink.rum ));
        foxList.add(new Fox("Scully", new ArrayList<Trick>(){
        },Food.pizza, Drink.rum ));
    }

    public Fox selectFoxByName (String name){

        for(Fox fox : foxList) {
            if (fox.getName().equals(name)) {
                return fox;
            }
        }
        return null;
    }









}
