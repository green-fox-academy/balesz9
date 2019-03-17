package com.greenfoxacadmy.programmerfoxclub.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoxListService {

    private List<Fox> foxList;

    public FoxListService() {
        this.foxList = new ArrayList<>();
        initializeList();
    }

    public void initializeList(){
    }



}
