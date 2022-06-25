package Enum;

public class Int {
    public static int MAX_VALUE = (int) Math.pow(2,31) - 1;
    public static int MIN_VALUE = (int) Math.pow(-2,31);
    private int i;

    public Int(){}

    public Int(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
// ×°Ïä·½·¨
    public static Int valueOf(int i) {
        return new Int(i);
    }

    public  int value(){
        return i;
    }
    public  int compareTo(Int b){
        if (i > b.getI()){
            return 1;
        }else if (i < b.getI()){
            return -1;
        }else {
            return 0;
        }
    }
    public static int max (int a , int b ) {
        return Math.max(a, b);
    }

    public static int sum (int a , int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "" + i;
    }
}
