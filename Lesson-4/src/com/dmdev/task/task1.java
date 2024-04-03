package com.dmdev.task;


/** вывести на консоль пару года который относится месяц
 *
 *
 */
public class task1 {

    public static void main(String[] args) {
        int month = 4;
//        зима - 12, 1, 2
//        весна - 3, 4, 5
//        лето - 6, 7, 8
//        осень - 9, 10, 11
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("зима");
        } else if (month >= 3 && month <= 5) {
            System.out.println("весна");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("лето");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("осень");
        } else {
            System.out.println("неправильное значение");
        }

    }
}
