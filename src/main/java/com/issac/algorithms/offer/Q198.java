package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-27
 * @desc:
 */
public class Q198 {

    /**
     * 表示考虑抢劫nums[i...n]的最大收益
     */
    static int[] memo;

    public static int solution(int[] nums) {
        memo = new int[nums.length];
        return tryRob(nums, 0);
    }

    public static int solution2(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        memo = new int[n];
        memo[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            // memo[i]
            for (int j = i; j < n; j++) {
                memo[i] = Math.max(memo[i], nums[j] + (j + 2 < n ? memo[j + 2] : 0));
            }
        }
        return memo[0];
    }

    /**
     * 考虑抢劫[index...nums.size()]这个范围的所有房子
     *
     * @param nums
     * @param index
     * @return
     */
    private static int tryRob(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }
        if (memo[index] != -1) {
            return memo[index];
        }
        int res = 0;
        for (int i = index; i < nums.length; i++) {
            res = Math.max(res, nums[i] + tryRob(nums, i + 2));
        }
        memo[index] = res;
        return res;
    }
}
