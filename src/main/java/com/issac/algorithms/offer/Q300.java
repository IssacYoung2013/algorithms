package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q300 {

    public static int solution(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        // memo[i]表示i为结尾的最长子序列长度
        int[] memo = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    memo[i] = Math.max(memo[i], 1 + memo[j]);
                }
            }
        }

        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(res, memo[i]);
        }
        return res;
    }
}
