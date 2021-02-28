package com.issac.algorithms.offer2.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Q1().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
