package com.dmdev.oop.lesson1;

public class TestExample {
    public static void main(String[] args) {
        int value = 10;
        int[] values = {value, 100, 99, 25};
        printarray(values);
    }

    private static void printarray(int[] values) {
        for (int value : values) {
            System.out.println(value);
        }
    }
}
