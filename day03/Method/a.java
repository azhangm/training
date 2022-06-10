package day03.Method;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i < nums.length - 1; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] + nums[j] == target)
        // return new int[] { i, j };
        // }
        // }
        // return new int[] {};

        // ¹þÏ£±í·¨
//                Map<Integer, Integer> map = new HashMap<>();
//                for (int i = 0; i < nums.length; i ++ ) {
//                    if (map.containsKey(target - nums[i])) {
//                        System.out.println(i);
//                        return new int[]{map.get(target - nums[i]), i};
//                    }
//                    map.put(nums[i], i);
//                }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }




    public static void main(String[] args) {
        for (int i : twoSum(new int[]{2, 7, 9, 2, 3}, 9)) {
            System.out.print(i + " ");
        }
    }
}