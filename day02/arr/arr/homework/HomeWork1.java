package day02.arr.arr.homework;

public class HomeWork1 {
    public static void main(String[] args) {
        int[]  a = {15,7,22,13,40};
        int[]  b = {15,7,22,15,40};
        System.out.println("两个数组是否相等 :" +  isEqual(a, b));
    }
    private static boolean isEqual(int[] a , int[] b) {
        if (a == null && b == null) return  true;
        if (a == null || b == null ) return  false;
        if (a.length != b.length ) return  false;
        for (int i = 0 ; i < a.length ; i ++ ) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
