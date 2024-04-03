package com.dmdev.lesson6.task;

public class Task4GPT {

    public static void main(String[] args) {

        int num = 23;

        if (isPrime(num)) {
            System.out.println(num + " является простым числом.");
        } else {
            System.out.println(num + " не является простым числом.");
        }
    }

    // Метод для определения, является ли число простым, используя цикл while
    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        int i = 2;
        while (i < value) {
            if (value % i == 0) {
                return false;
            }
            i++;
        }

        return true;
    }
}
