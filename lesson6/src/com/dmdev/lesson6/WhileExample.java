package com.dmdev.lesson6;

public class WhileExample {
    public static void main(String[] args) {
        int value = 0;
        do {
            System.out.println(value);
            value++;
        }while (value < 5);
    }

    private static void WhileExample() {
        int value = 10;
        while (value > 0) {
            System.out.println(value);
            value--;
        }
    }
}
