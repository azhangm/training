package day02.arr.arr.update;


public class RemoveEl {
    public static void main(String[] args) {
        int[] arr = {35,22,17,41,72,39,10,2,2,3};
        int idx = 1;
        for (; idx < arr.length - 1; idx ++) {
            arr[idx] = arr[idx + 1];
        }
//      坑点 ：移动玩以后将最后一个数字清0 因为他移动到最后一个元素了
        arr[idx] = 0;
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
