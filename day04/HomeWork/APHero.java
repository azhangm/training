package day04.HomeWork;

public class APHero extends Hero {

    public APHero() {
    }

    public APHero(String name, double ap, double hp, double armor, double moveSpeed) {
        super(name, ap, hp, armor, moveSpeed);
    }

    public String toString() {
        return "APHero{" +
                "name='" + getName() + '\'' +
                ", ap=" + getAp() +
                ", hp=" + getHp() +
                ", armor=" + getArmor() +
                ", moveSpeed=" + getMoveSpeed() +
                '}';
    }

    public void magicAttack() {
        System.out.println("魔法英雄进行魔法攻击");
    }

}

