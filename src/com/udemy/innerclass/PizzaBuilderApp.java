package com.udemy.innerclass;

import com.udemy.enum1.PizzaSize;

public class PizzaBuilderApp {

    public static void main(String[] args) {
    	PizzaApp pizza = new PizzaApp.Builder("Pizza cake", PizzaSize.LARGE)
                .withExtraTomatoSauce(true)
                .withSalad(true)
                .build();
        System.out.println("Name: " + pizza.getName());
        System.out.println("Size: " + pizza.getPizzaSize().getPizzaSizeText());
        System.out.println("Extra tomato sauce: " + pizza.isExtraTomatoSauce());
        System.out.println("Salad: " + pizza.isSalad());
    }
}