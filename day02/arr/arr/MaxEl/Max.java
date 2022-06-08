package day02.arr.arr;

public class Max {
    public static void main(String[] args) {
        int[] a = new int[]{10,8,23,41,52,66,34,12};
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("×î´óÖµ" + max);
    }
}
