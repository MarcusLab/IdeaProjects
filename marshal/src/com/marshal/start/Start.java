package com.marshal.start;

import java.io.IOException;

public class Start {

    public static void main(String[] args) throws IOException {

        char answer = 'B';

        System.out.println("Какую буку я загадал? ");
        System.out.print("Попытайся угадать: ");

        while (true) {
            char ch = Character.toUpperCase((char) System.in.read());

            if (ch == answer) {
                System.out.println("Good!!!");
                break;
            } else if (ch > answer) {
                System.out.println("mnogovato");
            } else {
                System.out.println("malo");
            }

            while (System.in.available() > 0){
                System.in.read();
            }

            System.out.print("Попробуй еще раз: ");
        }
    }
}