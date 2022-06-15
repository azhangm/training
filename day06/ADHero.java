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
        System.out.println(super.getName() + "ʹ��������������" + hero.getName());
        double v = (hero.getDamage() * 1.0 / hero.getArmor())  * 100;
        System.out.println(hero.getName() + "������" + v + "��Ѫ");
        hero.setHp(hero.getHp() - v);
        if (hero.getHp() < 0) System.out.println(hero.getName() + "�Ѿ�����");
        else
            System.out.println(hero.getName() + "ʣ��" + hero.getHp() + " Ѫ");
        }
}
