package com.dmdev.lesson5;

public class task1 {
    public static void main(String[] args) {
        int value1 = 90;
        int value2 = 10;
        int result = getmax(value1, value2);
        System.out.println(result);
    }
        public static int getmax(int firstvalue, int secondvalue) {
        if (firstvalue > secondvalue) {
            return firstvalue;
        }
            return secondvalue;
        }
}
