package com.marshal.Class;

public class Computer {
    private String name;
    private int ssd;
    private int cpu;

    public Computer(String name, int ssd, int cpu) {
        this.name = name;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public int getSsd() {
        return ssd;
    }

    public int getCpu() {
        return cpu;
    }

    public String getName() {
        return name;
    }
}
