package com.dmdev.lesson18;

import com.dmdev.lesson15.Archer;

public class listRunner {
    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("String1");
        list.add("String2");
        list.add("String3");

        String element = (String) list.get(1);
        System.out.println(element);
    }
}