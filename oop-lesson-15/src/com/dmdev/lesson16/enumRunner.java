package com.dmdev.lesson16;

import javax.swing.*;
import java.util.Arrays;

public class enumRunner {
    public static void main(String[] args) {
        ProcessorType processorType32 = ProcessorType.BIT_32;
        ProcessorType processorType64 = ProcessorType.BIT_64;
        System.out.println(processorType32);
        System.out.println(processorType32.name());
        System.out.println(processorType32.toString());
        System.out.println(ProcessorType.valueOf("BIT_32"));
        System.out.println(Arrays.toString(ProcessorType.values()));
        System.out.println(ProcessorType.BIT_32.ordinal());
        System.out.println(ProcessorType.BIT_64.getName());
        System.out.println(processorType32.getName());
        System.out.println(processorType64.getName());
        System.out.println(processorType64.getDescription());
    }
}
