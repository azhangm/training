package day06;

public class APHero extends Hero implements AP {
    public APHero(String name, double hp, int armor, int damage) {
        super(name, hp, armor, damage);
    }

    @Override
    public void aPAttacks(Hero hero) {
        if (hero.getHp() < 0) return;
        System.out.println(super.getName() + "ʹ��ħ������������" + hero.getName());
        double v = (hero.getDamage() * 1.0 / hero.getArmor())  * 100;
        System.out.println(hero.getName() + "������" + v + "��Ѫ");
        hero.setHp(hero.getHp() - v);
        if (hero.getHp() < 0) System.out.println(hero.getName() + "�Ѿ�����");
        else
            System.out.println(hero.getName() + "ʣ��" + hero.getHp() + " Ѫ");
    }


}
