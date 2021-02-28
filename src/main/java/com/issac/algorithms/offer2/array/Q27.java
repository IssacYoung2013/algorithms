package com.issac.algorithms.offer2.array;

import java.util.Arrays;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q27 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        // [0..k)保留非val元素
        int i = 0, k = 0;
        for (; i < nums.length; i++) {
            if (nums[i] != val) {
                if (i != k) {
                    swap(nums, i, k);
                }
                k++;
            }
        }
        return k;
    }

    void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(new Q27().removeElement(nums, 3));
        System.out.println(Arrays.toString(nums));
    }
}
