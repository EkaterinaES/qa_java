package com.example;

import java.util.List;

public class Lion{
    final Feline feline;
    boolean hasMane;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
       // return feline.getKittens();
        return feline.getKittens();//но код должен реализовывать методы Feline
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
       // Feline feline = new Feline();//так что-ли получить feline?
       return feline.getFood("Хищник");
    }
}
