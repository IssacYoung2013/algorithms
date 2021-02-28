package com.issac.algorithms.offer2.array;

import java.util.Arrays;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int k = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[k - 1] != nums[i]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 4};
        System.out.println(new Q80().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
