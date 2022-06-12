package day04.HomeWork;

public class ADHero extends Hero {

    public ADHero() {
    }

    public ADHero(String name, double ap, double hp, double armor, double moveSpeed) {
        super(name, ap, hp, armor, moveSpeed);
    }

    public void physicAttack() {
        System.out.println("物理英雄进行物理攻击");
    }

    @Override
    public String toString() {
        return "ADHero{" +
                "name='" + getName() + '\'' +
                ", ap=" + getAp() +
                ", hp=" + getHp() +
                ", armor=" + getArmor() +
                ", moveSpeed=" + getMoveSpeed() +
                '}';
    }
}

