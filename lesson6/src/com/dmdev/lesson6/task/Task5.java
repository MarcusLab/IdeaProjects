package com.dmdev.lesson6.task;

public class Task5 {
    public static void main(String[] args) {
        printletters();
    }
        public static void printletters() {
            for (char letter = 'z'; !isVowel(letter); letter++) {
                System.out.println(letter);
                if (letter == 'z') ;
                break;
            }
        }


    public static boolean isVowel(char value) {
        return value == 'a' || value == 'e' || value == 'y' || value == 'i' || value == 'o' || value == 'u';
    }
}
