package com.dmdev.lesson7.task;

public class task4 {
    public static void main(String[] args) {
        // index        0  1  2  3  4  5  6   7
        int[] values = {1, 0, 2, 5, 6, 4, 10, 3};
        System.out.println("min Index: " + findminIndex(values));
        System.out.println("max Index: " + findMaxIndex(values));

        System.out.println(calcSumBetween(values));
    }

    public static int calcSumBetween (int[] values) {
        int minIndex = findminIndex(values);
        int maxIndex = findMaxIndex(values);
        if (minIndex > maxIndex){
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        int result =0;
        for (int i = minIndex +1; i < maxIndex ; i++) {
            result += values[i];
        }
        return result;
    }

    public static int findminIndex(int[] values) {
        int minIndex = 0;
        int minvalue = values[minIndex];
        for (int i = 0; i < values.length; i++) {
            if (minvalue > values[i]) {
                minvalue = values[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static int findMaxIndex(int[] values) {
        int maxIndex = 0;
        int maxvalue = values[maxIndex];
        for (int i = 0; i < values.length; i++) {
            if (maxvalue < values[i]) {
                maxvalue = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
