package com.marshal.Class;

public class Runner {
    public static void main(String[] args) {
        Computer apple = new Computer("iMac", 3500, 8000);
        System.out.println("Name: " + apple.getName() + " CPU: " + apple.getCpu() + " SSD: " + apple.getSsd());

        Computer hp = new Computer("HP", 4500, 6000);
        System.out.println("Name: " + hp.getName() + " CPU: " + hp.getCpu()+ " SSD: " + hp.getSsd());

    }
}
