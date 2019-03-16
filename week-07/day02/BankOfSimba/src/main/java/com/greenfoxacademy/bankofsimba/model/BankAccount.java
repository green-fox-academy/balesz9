package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    boolean king;
    boolean badGuy;

    public BankAccount(){
    }

    public BankAccount(String name, double balance, String animalType, boolean king, boolean badGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
        this.badGuy = badGuy;
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
        return king;
    }

    public boolean isBadGuy() {
        return badGuy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setKing(boolean king) {
        this.king = king;
    }

    public void setBadGuy(boolean badGuy) {
        this.badGuy = badGuy;
    }

    public void raiseBalance(){
        if (this.king){
            this.balance +=100;
        } else{
            this.balance +=10;
        }


    }

}
