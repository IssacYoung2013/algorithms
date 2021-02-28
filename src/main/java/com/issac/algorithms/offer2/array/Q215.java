package com.issac.algorithms.offer2.array;


import java.util.Random;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc: the Kth larger element in an array
 */
public class Q215 {

    public int findKthLargest(int[] nums, int k) {
        // 快排思路
        int n = nums.length;
        return quickSort(nums, 0, n - 1, n - k);
    }

    private int quickSort(int[] nums, int l, int r, int index) {
        int part = partition(nums, l, r);
        if (part == index) {
            return nums[index];
        } else {
            return part < index ?
                    quickSort(nums, part + 1, r, index) :
                    quickSort(nums, l, part - 1, index);
        }
    }

    private int partition(int[] nums, int l, int r) {
        int p = l, x = nums[l];
        for (int i = l + 1; i <= r; i++) {
            if (nums[i] < x) {
                p++;
                swap(nums, p, i);
            }
        }
        swap(nums, p, l);
        return p;
    }

    void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }


    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int[] nums2 = {3, 2, 1, 5, 6, 4};

        System.out.println(new Q215().findKthLargest(nums, 4));
    }
}
