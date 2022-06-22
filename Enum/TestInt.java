package Enum;

public class TestInt {

    public static void main(String[] args) {
        Int i = new Int(100);
        System.out.println(i.getI());
        Int anInt = new Int(888);
        System.out.println(i.compareTo(anInt));
        Int anInt1 = Int.valueOf(333);
        System.out.println(anInt1);
        System.out.println(Int.MAX_VALUE);
        System.out.println(Int.MIN_VALUE);
        System.out.println(Int.sum(3,4));
    }



}
