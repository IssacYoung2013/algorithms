package com.issac.algorithms.offer;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * @author: ywy
 * @date: 2021-02-21
 * @desc: 两个元素之和
 */
public class Q167 {
    /**
     * 1. 最直接的思考：暴力，双层遍历，O(n^2)
     * 2. 有序？二分查找，i，查找 target-nums[i]
     * 3. 对撞指针
     *
     * @param arr
     * @param target
     * @return
     */
    public static int[] solution(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            if (arr[l] + arr[r] == target) {
                int[] res = {l + 1, r + 1};
                return res;
            } else if (arr[l] + arr[r] < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{-1, -1};
    }
}
