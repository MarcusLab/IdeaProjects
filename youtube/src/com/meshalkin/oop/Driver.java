package com.meshalkin.oop;
public class Driver extends Employee {
    private String carModel;

    public Driver(String name, String lastname, int salary, String carModel) {
        super(name, lastname, salary);
        this.carModel = carModel;
    }

    @Override
    public void toWork() {
        System.out.println("Водитель " + getName() + " " + getLastname() + " с заплатой " + getSalary() + " едет на автомобиле " + carModel);
    }
}
