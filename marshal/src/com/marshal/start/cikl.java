package com.marshal.start;

import java.io.IOException;

public class cikl {

    public static void main(String[] args) throws IOException {

       /* for (int i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Итерация " + i);
        }*/

        int count = 0;

        while (count < 10){
            count++;

            if ((count%2) != 1) continue;
            System.out.print(count);
        }
    }
}
