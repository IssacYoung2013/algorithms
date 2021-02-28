package com.issac.algorithms.offer2.array;


import java.util.Arrays;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc: move zero
 */
public class Q283 {

    public void moveZeroes(int[] nums) {
        int i = 0, k = 0;
        for (; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != k) {
                    swap(nums, i, k);
                }
                k++;
            }
        }
    }

    void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new Q283().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
