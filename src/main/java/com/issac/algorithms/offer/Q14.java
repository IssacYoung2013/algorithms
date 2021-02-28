package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-20
 * @desc: 剪绳子
 */
public class Q14 {
    public static int solution(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(8));
        System.out.println(solution(10));

    }
}
