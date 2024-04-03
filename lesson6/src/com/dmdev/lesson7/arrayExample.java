package com.dmdev.lesson7;

public class arrayExample {
    public static void main(String[] args) {
    int[] values = new int[10];
//        System.out.println(values[5]);

        values [5] = 7;
        values [8] = 47;

        for (int i = 0; i < values.length; i++) {
            System.out.println(i + ": " + values[i]);
        }
    }

    private static void test() {
        int[] values = {1, 2, 6, 8, 9};
        System.out.println(values[3]);

        values[0] = 28;
        System.out.println(values[0]);
    }
}
