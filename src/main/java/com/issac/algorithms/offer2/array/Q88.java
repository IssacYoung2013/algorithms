package com.issac.algorithms.offer2.array;

import java.util.Arrays;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc: merge sorted array
 */
public class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        assert nums1.length == m + n;
        int i = m - 1, j = n - 1;
        int tail = m + n - 1;
        int cur;
        while (i >= 0 || j >= 0) {
            if (i == -1) {
                cur = nums2[j--];
            } else if (j == -1) {
                cur = nums1[i--];
            } else if (nums1[i] > nums2[j]) {
                cur = nums1[i--];
            } else {
                cur = nums2[j--];
            }
            nums1[tail--] = cur;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        new Q88().merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
