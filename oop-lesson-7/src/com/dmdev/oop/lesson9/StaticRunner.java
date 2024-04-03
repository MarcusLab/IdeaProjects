package com.dmdev.oop.lesson9;

import com.dmdev.oop.lesson7.Computer;

public class StaticRunner {
    public static void main(String[] args) {
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        Computer computer = new Computer(null, null);
        System.out.println(Computer.getCounter());
        Class<? extends Computer> clazz = computer.getClass();

    }
}
