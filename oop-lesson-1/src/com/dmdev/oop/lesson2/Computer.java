package com.dmdev.oop.lesson2;

public class Computer {

    int ram = 2048;
    int ssd;

    Computer() {
        System.out.println("я был создан");
    }

    Computer(int newSSD) {
        ssd = newSSD;
    }

    Computer(int newSSD, int newRam) {
        ssd = newSSD;
        ram = newRam;

    }

    void load() {
        System.out.println("Я загрузился");
    }
    void printState() {
        System.out.println("SSD " + ssd);
        System.out.println("Ram " + ram);
        System.out.println();
    }
}
