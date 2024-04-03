package com.dmdev.lesson20.exception;

/**
 * 3. Создать собственный класс-исключение - наследник класса Exception.
 *           Создать метод, выбрасывающий это исключение.
 *           Вызвать этот метод и отловить исключение. Вывести stack trace в
 * консоль.
 */
public class Task3 {
    public static void main(String[] args) {
        try {
            unsafe();
        } catch (DmdevException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static void unsafe() {
        throw new DmdevException("Runtime exception");
    }
}
