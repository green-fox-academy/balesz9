package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    boolean isKing;
    boolean isBadGuy;


    public BankAccount(String name, double balance, String animalType, boolean isKing, boolean isBadGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        this.isBadGuy = isBadGuy;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public boolean isBadGuy() {
        return isBadGuy;
    }

}
