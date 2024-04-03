package com.dmdev.lesson7.task;

public class task1 {
    public static void main(String[] args) {
    int[] values = {1, 5, 7, 9, 11};
    printarray(values);
    printarrayForeach(values);
    printarrayReverse(values);
    }

    public static void printarrayReverse(int[] values) {
        for (int i = values.length -1; i >= 0 ; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }


    public static void printarray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
    public static void printarrayForeach(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
