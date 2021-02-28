package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-27
 * @desc:
 */
public class Q70 {
    static int[] memo;

    public static int solution(int n) {
        memo = new int[n + 1];
        memo[0] = 1;
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
//        return calcWays(n);
    }

    private static int calcWays(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (memo[n] == 0) {
            memo[n] = calcWays(n - 1) + calcWays(n - 2);
        }
        return memo[n];
    }

    public static void main(String[] args) {

    }
}
