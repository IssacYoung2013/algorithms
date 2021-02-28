package com.issac.algorithms.offer2.array;

import java.util.Arrays;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new Q26().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
