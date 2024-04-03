package com.meshalkin.oop;

public class oopRunner {
    public static void main(String[] args) {
        Employee driver = new Driver("Иван", "Иванов", 100000, "Toyota");
        Employee javaDeveloper = new JavaDeveloper("Сергей", "Сергеев", 150000);

        driver.toWork();
        javaDeveloper.toWork();
    }
}
