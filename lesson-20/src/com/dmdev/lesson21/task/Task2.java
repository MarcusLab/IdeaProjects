package com.dmdev.lesson21.task;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "String-1",
                "String-2",
                "String-3",
                "String-4",
                "String-10",
                "String-10",
                "String-10",
                "String-12",
                "String-16"

        );
        int result = strings.stream()
                .filter(value -> value.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(result);

        long result2 = strings.stream()
                .filter(value -> value.length() > 8)
                .distinct()
                .count();
        System.out.println(result2);
    }
}
