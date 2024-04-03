package com.meshalkin.generic;

public class Main {
    public static void main(String[] args) {
        genericExample<Object, Object> example = new genericExample<>();

        String vString = " Конечно же.";

        Car car1 = new Car("Toyota", 2023);
        Car car2 = new Car("Mazda", 2021);
        Car car3 = new Car("Volvo", 2015);
        Car car4 = new Car("BMW", 2020);

        example.addToString(car1, vString);
        example.addToString(car2, vString);
        example.addToString(car3, vString);
        example.addToString(car4, vString);

        System.out.println(example.getString());
    }
}