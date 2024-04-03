package com.dmdev.lesson11;

public class oopLessonRunner {
    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(500);
//        Computer computer = new Computer(ssd, ram);
//        computer.load();
        System.out.println();

    Laptop laptop = new Laptop(new Ssd(250), new Ram(512), 2);
    laptop.open();
    laptop.load();
    }
}
