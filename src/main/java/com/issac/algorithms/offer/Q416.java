package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-27
 * @desc:
 */
public class Q416 {

    static int[][] memo;

    static boolean solution(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            assert (nums[i] > 0);
            sum += nums[i];
        }

        if (sum % 2 != 0) {
            return false;
        }
        memo = new int[nums.length][sum / 2 + 1];
        return tryPartition(nums, nums.length - 1, sum / 2);
    }

    static boolean[] memo2;

    static boolean solution2(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            assert (nums[i] > 0);
            sum += nums[i];
        }

        if (sum % 2 != 0) {
            return false;
        }
        int C = sum / 2;
        memo2 = new boolean[C + 1];
        for (int i = 0; i <= C; i++) {
            memo2[i] = (nums[0] == i);
        }
        for (int i = 1; i < n; i++) {
            for (int j = C; j >= nums[i]; j--) {
                memo2[j] = memo2[j] || memo2[j - nums[i]];
            }
        }
        return memo2[C];
    }

    /**
     * nums[0...index]是否可以填充一个容量为sum的别报
     *
     * @param nums
     * @param index
     * @param sum
     * @return
     */
    private static boolean tryPartition(int[] nums, int index, int sum) {
        if (sum == 0) {
            return true;
        }
        if (sum < 0 || index < 0) {
            return false;
        }
        if (memo[index][sum] != 0) {
            return memo[index][sum] == 1;
        }
        memo[index][sum] = tryPartition(nums, index - 1, sum) ||
                tryPartition(nums, index - 1, sum - nums[index]) ? 1 : 2;
        return memo[index][sum] == 1;
    }
}
