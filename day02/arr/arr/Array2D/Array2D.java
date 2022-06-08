package day02.arr.arr.Array2D;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][];

        int[][] arr2 = {{1,2,3,4},
                {5,6,7,8,1,2}
        };

        for (int[] ints : arr2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }

            System.out.println();

        }
    }
}
