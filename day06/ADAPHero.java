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
        System.out.println(super.getName() + "ʹ�û�Ϲ���������" + hero.getName());
        adAttacks(hero);
        aPAttacks(hero);
        System.out.println(hero.getName() + "������" + sum + "��Ѫ");
        if (hero.getHp() < 0) System.out.println(hero.getName() + "�Ѿ�����");
        else
        System.out.println(hero.getName() + "ʣ��" + hero.getHp() + " Ѫ");

    }
}
