package com.greenfoxacademy.restbackend.Model;

public class DoUntil {
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

   /*   public int sumUntil(int until) {
        int result = 0;
        for (int i = 1; i < until+1; i++) {
            result += i;
        }
        return result;
    }

    public int multiplyUntil(int until)   {
        int result = 0;
        for (int i = 1; i < until+1; i++) {
            result *= i;
        }
        return result;
    }*/

    public void setResult(String action, Integer number) {
        Integer temp = 0;
        Integer temp2 = 1;
        if (action.equalsIgnoreCase("sum")) {
            for (int i = 0; i <= number; i++) {
                temp += i;
            }
            this.result = temp;
        } else if (action.equalsIgnoreCase("factor")) {
            for (int i = 1; i <= number; i++) {
                temp2 *= i;
            }
            this.result = temp2;
        }
    }
}
