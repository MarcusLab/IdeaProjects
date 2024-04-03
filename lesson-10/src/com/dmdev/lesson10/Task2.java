package com.dmdev.lesson10;


/*
2. Написать функцию, принимающую 2 параметра: строку и слово - и
 * возвращающую true, если строка начинается и заканчивается этим словом.*/

public class Task2 {
    public static void main(String[] args) {
        String value = "132 gkkgdifmmmm 132";
        String word = "132";
        System.out.println(isStartAndEnd(value, word));
    }

    private static boolean isStartAndEnd(String target, String word){
        return target.startsWith(word) && target.endsWith(word);
    }
}
