package com.udemy.innerclass;

import com.udemy.enum1.PizzaSize;

public class PizzaApp {
    private String name;
    private PizzaSize pizzaSize;
    private boolean isExtraTomatoSauce;
    private boolean isSalad;

    private PizzaApp(Builder builder) {
        this.name = builder.name;
        this.pizzaSize = builder.pizzaSize;
        this.isExtraTomatoSauce = builder.isExtraTomatoSauce;
        this.isSalad = builder.isSalad;
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public boolean isExtraTomatoSauce() {
        return isExtraTomatoSauce;
    }

    public boolean isSalad() {
        return isSalad;
    }

    public static class Builder {
        private String name;
        private PizzaSize pizzaSize;
        private boolean isExtraTomatoSauce;
        private boolean isSalad;

        Builder(String name, PizzaSize pizzaSize) {
            this.name = name;
            this.pizzaSize = pizzaSize;
        }

        public Builder withExtraTomatoSauce(boolean isExtraTomatoSauce) {
            this.isExtraTomatoSauce = isExtraTomatoSauce;
            return this;
        }

        public Builder withSalad(boolean isSalad) {
            this.isSalad = isSalad;
            return this;
        }

        public PizzaApp build(){
            return new PizzaApp(this);
        }

    }
}