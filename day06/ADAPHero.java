package day06;

public class ADAPHero extends Hero implements AD,AP {
    public ADAPHero(String name, double hp, int armor, int damage) {
        super(name, hp, armor, damage);
    }
double sum = 0;
    public ADAPHero() {
    }

    @Override
    public void adAttacks(Hero hero) {
        double v = (hero.getDamage() * 1.0 / hero.getArmor())  * 30;
        sum += v;
        hero.setHp(hero.getHp() - v);

    }

    @Override
    public void aPAttacks(Hero hero) {
        double v = (hero.getDamage() * 1.0 / hero.getArmor())  * 30;
        sum += v;
        hero.setHp(hero.getHp() - v);
    }

    public void adapAttacks (Hero hero) {
        if (hero.getHp() < 0) return;
        System.out.println(super.getName() + "使用混合攻击攻击了" + hero.getName());
        adAttacks(hero);
        aPAttacks(hero);
        System.out.println(hero.getName() + "消耗了" + sum + "的血");
        if (hero.getHp() < 0) System.out.println(hero.getName() + "已经死亡");
        else
        System.out.println(hero.getName() + "剩余" + hero.getHp() + " 血");

    }
}
