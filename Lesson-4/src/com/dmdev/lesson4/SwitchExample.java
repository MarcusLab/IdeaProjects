package com.dmdev.lesson4;

public class SwitchExample {
    public static void main(String[] args) {
//        byte, short, int, char, string, enum
        int value = 2;
        switch (value) {
            case 1 -> System.out.println("value == 1");
            case 2, 3, 4 -> System.out.println("value == 2,3,4");
            case 10 -> System.out.println("value == 10");
            case 28 -> System.out.println("value == 28");
            case 33 -> System.out.println("value == 33");
            default -> System.out.println("нет такого значения");
        }
    }
}
