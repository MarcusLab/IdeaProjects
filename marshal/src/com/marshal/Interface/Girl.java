package com.marshal.Interface;

public class Girl implements Player, Study {
    @Override
    public void play() {
        System.out.println("Ударила рукой ");

    }

    @Override
    public void read() {
        System.out.println("О, рецепты!!!");
    }
}
