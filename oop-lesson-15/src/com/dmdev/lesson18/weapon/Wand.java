package com.dmdev.lesson18.weapon;

import java.util.Random;

public class Wand implements MagicWeapon{

    private final Random random = new Random();
    @Override
    public int getDamage() {
        return random.nextInt(50) + 1;
    }
}
