package com.marshal.Interface;

public class Boy implements Player, Study {

    @Override
    public void play() {
        System.out.println("Пнул ногой ");

    }

    @Override
    public void read() {
        System.out.println("О, книжки!!!");
    }
}
