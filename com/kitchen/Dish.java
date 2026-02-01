package com.kitchen;

public class Dish {
    private final String name;
    private final int calories;

    public Dish(String name, int calories){
        this.calories = calories;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString(){
        return String.format("%s : %d cal", name,calories);
    }

}
