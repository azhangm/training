package day06;

import day04.HomeWork.APHero;

public class Hero {
    private String name;
    private double hp;
    private int armor;
    private int damage;

    public Hero(String name, double hp, int armor, int damage) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.damage = damage;
    }

    public Hero() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", armor=" + armor +
                ", damage=" + damage +
                '}';
    }
}
//