package com.issac.algorithms.offer2.array;

import java.util.Arrays;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q75 {
    public void sortColors(int[] nums) {
        // 3路快排
        // num[0..zero] == 0
        // num[zero+1..two] == 1
        // num[two+1...n-1] == 2
        int n = nums.length;
        int i = 0, zero = 0, two = n;
        while (i < two) {
            if (nums[i] < 1) {
                swap(nums, i++, zero++);
            } else if (nums[i] > 1) {
                swap(nums, i, --two);
            } else {
                i++;
            }
        }
    }

    void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        new Q75().sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
