package com.dmdev.lesson6.task;

public class task2 {
    public static void main(String[] args) {
        int value = 1345;
        int result = sum(value);
        System.out.println(result);

        int result2 = sumfor(value);
        System.out.println(result2);
    }

    public static int sum(int value) {
        int result = 0;
        int currentvalue = value;
        while (currentvalue !=0) {
            result += currentvalue %10;
            currentvalue /= 10;

        }

        return result;
    }
    public static int sumfor(int value) {
        int result = 0;
        for (int currentvalue = value; currentvalue != 0; currentvalue /= 10) {
            result += currentvalue % 10;
        }

        return result;
    }
}
