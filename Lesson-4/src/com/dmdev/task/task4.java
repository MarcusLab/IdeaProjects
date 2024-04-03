package com.dmdev.task;

public class task4 {
    public static void main(String[] args) {
        int year = 1900;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " виcокостный");
        } else
            System.out.println(year + " не виcокостный");


    }
}