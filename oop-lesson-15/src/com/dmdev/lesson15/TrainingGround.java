package com.dmdev.lesson15;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Гоги", 15);
        Hero mage = new Mage("Дуралей", 20);
        Hero archer = new Archer("Шрек", 10);

        Enemy enemy = new Enemy("Зомбяо", 100);

        attackEnemy(enemy, warrior, mage, archer);
    }
    public static void attackEnemy(Enemy enemy, Hero... heroes){
        while (enemy.isAlive()){
            for (Hero hero : heroes) {
                if (enemy.isAlive()){
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
