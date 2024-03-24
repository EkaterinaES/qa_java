package com.example;

import java.util.List;

public class LionAlex extends Lion {
    Feline feline;

    public LionAlex(Feline feline) {
        super(feline);
    }
    public LionAlex() throws Exception {
        super("Самец");
    }

    @Override
    public int getKittens() {
        return 0;
    }

    @Override
    public boolean doesHaveMane() {
        return hasMane;
    }

    @Override
    public List<String> getFood() throws Exception {
        return super.feline.getFood("Хищник");
    }
    public List<String> getFriends(){
        return List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
    }
    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }
}
