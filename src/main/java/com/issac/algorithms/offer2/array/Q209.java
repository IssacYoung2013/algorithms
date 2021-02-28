package com.issac.algorithms.offer2.array;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q209 {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = -1;
        int res = nums.length + 1;
        int sum = 0;
        while (i < nums.length) {
            if (j + 1 < nums.length && sum < target) {
                sum += nums[++j];
            } else {
                sum -= nums[i++];
            }
            if (sum >= target) {
                res = Math.min(res, j - i + 1);
            }
        }
        if (res == nums.length + 1) {
            return 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(new Q209().minSubArrayLen(11, nums));
    }
}
