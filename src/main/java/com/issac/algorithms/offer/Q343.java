package com.issac.algorithms.offer;

import java.util.Map;

/**
 * @author: ywy
 * @date: 2021-02-27
 * @desc:
 */
public class Q343 {

    static int[] memo;

    public static int solution(int n) {
        assert n >= 2;
        memo = new int[n + 1];
//        return breakInteger(n);
        memo[1] = 1;
        for (int i = 2; i < n; i++) {
            // 求解memo[i]
            for (int j = 1; j <= i - 1; j++) {
                memo[i] = Math.max(memo[i], Math.max(j * (i - j), j * memo[i - j]));
            }
        }
        return memo[n];
    }

    /**
     * 将n至少分割两部分
     *
     * @param n
     * @return
     */
    private static int breakInteger(int n) {
        if (n == 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        int res = -1;
        for (int i = 1; i < n; i++) {
            res = Math.max(Math.max(res, i * (n - i)), i * breakInteger(n - i));
        }
        memo[n] = res;
        return res;
    }
}
