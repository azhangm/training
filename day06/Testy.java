package day06;

public class Testy {
    public static void main(String[] args) {
        ADHero h1 = new ADHero("’≈∑…",1000,10,20);
        APHero h2 = new APHero("¡ı±∏",1000,200,20);
        ADAPHero h3 = new ADAPHero("—Ó”Òª∑" ,1000,101,10);
         h1.adAttacks(h2);
         h2.aPAttacks(h1);
         h3.adapAttacks(h1);
    }
}
