package com.kitchen;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class Main {

    public static void main(String... args){
        List<Dish> menu = new ArrayList<>();
        menu.add(new Dish("Apple", 100) );
        menu.add(new Dish("Salad", 200) );
        menu.add(new Dish("Soup", 300) );
        menu.add(new Dish("Meat", 400) );
        menu.add(new Dish("Cake", 500) );
        menu.add(new Dish("Beef", 600) );
        menu.add(new Dish("Sushi", 700) );
        menu.add(new Dish("Turkey", 800) );
        menu.add(new Dish("Roasted Pig", 900) );
        menu.add(new Dish("Potatoes", 1000) );

        Stream<Dish> stream = menu.stream();
        List<String> namesMore500 = stream
                .filter((Dish x ) -> x.getCalories() >500)
                .sorted(comparing(Dish::getName))
                .map(Dish::getName).toList();


        System.out.println("Before: " + menu);
        System.out.println("After: " + namesMore500);





    }
}
