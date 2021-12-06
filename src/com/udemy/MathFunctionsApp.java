package com.udemy;

public class MathFunctionsApp {

    public static void main(String[] args) {

        double temperatureYesterday = 5.6;
        double temperatureToday = -Math.random() * 10;

        System.out.println("Absolute temperature today: " + Math.abs(temperatureToday));
        System.out.println("Min: " + Math.min(temperatureToday, temperatureYesterday));
        System.out.println("Max: " + Math.max(temperatureToday, temperatureYesterday));
        System.out.println("Round: " + Math.round(temperatureYesterday));
        System.out.println("Ceiling: " + Math.ceil(temperatureYesterday));
        System.out.println("Floor: " + Math.floor(temperatureYesterday));


        System.out.println("Power: " + Math.pow(temperatureToday, 2));
        System.out.println("Square root: " + Math.sqrt(Math.abs(temperatureToday)));

    }
}