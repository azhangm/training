package day06;

public class ADHero  extends Hero implements AD {
    public ADHero(String name, double hp, int armor, int damage) {
        super(name, hp, armor, damage);
    }

    public ADHero() {
    }

    @Override
        public void adAttacks(Hero hero) {
        if (hero.getHp() < 0) return;
        System.out.println(super.getName() + "使用物理攻击攻击了" + hero.getName());
        double v = (hero.getDamage() * 1.0 / hero.getArmor())  * 100;
        System.out.println(hero.getName() + "消耗了" + v + "的血");
        hero.setHp(hero.getHp() - v);
        if (hero.getHp() < 0) System.out.println(hero.getName() + "已经死亡");
        else
            System.out.println(hero.getName() + "剩余" + hero.getHp() + " 血");
        }
}
