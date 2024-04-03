package com.dmdev.lesson7.task;

public class task2 {
    public static void main(String[] args) {
    int[] values = new int[100];
    fillArray(values);
    task1.printarray(values);
    }
    public static void fillArray(int[] values) {
        int currentIndex = 0;
        for (int currentvalue = 1; currentIndex < values.length ; currentvalue++) {
            if (currentvalue % 13 == 0 || currentvalue % 17 == 0) {
                values[currentIndex] = currentvalue;
                currentIndex++;
            }
        }
    }
}
