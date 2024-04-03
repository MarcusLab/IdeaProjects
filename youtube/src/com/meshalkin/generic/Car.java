package com.meshalkin.generic;

public class Car {
    private String model;
    private int year;

    @Override
    public String toString() {
        return "Это автомобиль " + model + ", " + year + " года выпуска." ;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
