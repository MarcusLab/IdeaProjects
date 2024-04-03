package com.dmdev.oop.lesson2;

public class ComputerRunner {

    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.load();
        computer.printState();
//        System.out.println("Ram " + computer.ram);
//        System.out.println("SSD " + computer.ssd);

        Computer computer2 = new Computer(1050);
        computer2.printState();

        Computer computer3 = new Computer(10500, 10000);
        computer3.printState();
    }
}
