package com.greenfoxacademy.practice.model;

public class Inhabitant {

    private static  int nextID = 0; //static mert class-hoz tartozik, nem az egyes példányhoz

    private int id;
    private String name;
    private int age;
    private Gender gender;

    public Inhabitant(String name, int age, Gender gender) {
        this.id = nextID++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}
