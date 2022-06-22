package wapper;

public class Int {
    private int i;

    private Int(int i) {
        this.i = i;
    }

    public static Int getOb(int i) {
        return new Int(i);
    }

    public static int max (int a , int b ) {
        return Math.max(a, b);
    }

    public static int sum (int a , int b) {
        return a + b;
    }

}
