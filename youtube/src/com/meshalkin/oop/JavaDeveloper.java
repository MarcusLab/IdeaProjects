package com.meshalkin.oop;

public class JavaDeveloper extends Employee{
    private String getLaptopModel(){
        return "HP";
    }

    public JavaDeveloper(String name, String lastname, int salary) {
        super(name, lastname, salary);
    }


    @Override
    public void toWork() {
        System.out.println("Програмист " + getName() + getLastname() + " с заплатой " + getSalary() + " прогамиует на ноуте " + getLaptopModel());
    }
}
