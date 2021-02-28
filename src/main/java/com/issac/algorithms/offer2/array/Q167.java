package com.issac.algorithms.offer2.array;

import java.util.Arrays;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < numbers.length - 1 && j >= 0) {
            int res = numbers[i] + numbers[j];
            if (res == target) {
                return new int[]{i + 1, j + 1};
            } else if (res < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(new Q167().twoSum(nums, target)));
    }
}
