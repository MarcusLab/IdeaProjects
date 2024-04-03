package com.dmdev.lesson6.task;

public class task4 {

    public static void main(String[] args) {
        int value = 22;
        boolean result = isSimple(value);
        System.out.println(result);

        boolean result2 = isSimpleWhile(value);
        System.out.println(result2);

    }

    public static boolean isSimple (int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
                break;
            }

        }

        return result;

    }
    public static boolean isSimpleWhile (int value) {
        boolean result = true;
        int i = 2;
        while (i < value) {
            if (value % i == 0) {
                result = false;
                break;
            }
            i++;

        }

        return result;
    }

}
