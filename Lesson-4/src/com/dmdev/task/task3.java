package com.dmdev.task;

public class task3 {
    public static void main(String[] args) {
        int rubels = 113;
        if (rubels % 10 == 1 && rubels % 100 != 11) {
            System.out.println(rubels + " рубль");
        } else if ((rubels % 10 >= 2 && rubels % 10 <= 4)
        && !(rubels % 100 >= 12 && rubels % 100 <= 14)) {
            System.out.println(rubels + " рубля");
        } else  {
            System.out.println(rubels + " рублей");
        }
    }
}
