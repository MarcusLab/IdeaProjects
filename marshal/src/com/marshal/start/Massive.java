package com.marshal.start;

public class Massive {

    public static void main(String[] args) {

        int[] nums = new int[4];

        for (int i = 0; i < 4; i++) {
            nums[i] = i;
        }
        nums[3] = 100;

        for (int e : nums) {
            System.out.println("Элемент " + e);
        }

//        for (int i = 0; i < 4; i++) {
//            System.out.println("Элемент [" + i + "]" + nums[i]);
//        }
    }
    
}
