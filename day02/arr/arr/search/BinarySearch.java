package day02.arr.arr;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[] {5,13,19,21,37,56,64,75,80,88,92};
//        System.out.println(search(a,56));
        System.out.println(binSearch(a,56));
//        System.out.println(search(a,56));
    }
    private static int binSearch(int[] arr,int target) {
        int left = 0;
        int right = arr.length - 1;
//        left < right   [3,2] [left + 1 , right]
        // 最后区间 left == right
        for (; left < right;) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }else if (arr[mid] > target) {
                right = mid - 1;
            }else if (arr[mid] < target) {
                left = mid + 1;
            }
        }
//        System.out.println(left + right);
        //需要 打一个补丁
        if (arr[left] == target) return left;
        return -1;
    }
    private static int search(int[] arr , int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
