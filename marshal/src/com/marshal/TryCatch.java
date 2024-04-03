package com.marshal;

public class TryCatch {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            System.out.println("Начало");
            nums[7] = 10;
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("ошибка");
        }
    }
}

//ArrayStoreException /*несовместимый тип*/
//ArrayIndexOutOfBoundsException /*выход за пределы например масива*/
//ClassCastException /*недопустимое привидение типов*/
//IllegalArgumentException /*недопустимые параметры при вызове метода*/
//NegativeArraySizeException /*отрицательный размер*/
//NullPointerException /*ошибка пустой ссылки*/
//TypeNotPresentException /*ошибка неизвестный тип*/
//UnsupportedOperationException /*операция не поддерживается*/
//ClassNotFoundException /*класс не найден*/
//InstantiationException /*ошибка абстрактного класса*/