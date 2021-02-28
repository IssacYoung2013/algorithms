package com.issac.algorithms.offer;

import java.util.Map;

/**
 * @author: ywy
 * @date: 2021-02-27
 * @desc:
 */
public class Knapsack01 {

    static int[][] memo;

    static int solution(int[] w, int[] v, int C) {
        int n = w.length;
        memo = new int[n][C + 1];
        return bestValue(w, v, n - 1, C);
    }

    static int solution2(int[] w, int[] v, int C) {
        assert (w.length == v.length);
        int n = w.length;
        if (n == 0) {
            return 0;
        }
        memo = new int[2][C + 1];
        for (int j = 0; j < C + 1; j++) {
            memo[0][j] = j >= w[0] ? v[0] : 0;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < C + 1; j++) {
                memo[i % 2][j] = memo[(i - 1) % 2][j];
                if (j >= w[i]) {
                    memo[i % 2][j] = Math.max(memo[i % 2][j], v[i] + memo[(i - 1) % 2][j - w[i]]);
                }
            }
        }
        return memo[(n - 1) % 2][C];
    }

    static int[] memo2;

    static int solution3(int[] w, int[] v, int C) {
        assert (w.length == v.length);
        int n = w.length;
        if (n == 0) {
            return 0;
        }
        memo2 = new int[C + 1];
        for (int j = 0; j < C + 1; j++) {
            memo2[j] = j >= w[0] ? v[0] : 0;
        }
        for (int i = 1; i < n; i++) {
            for (int j = C; j >= w[i]; j--) {
                memo2[j] = Math.max(memo2[j], v[i] + memo2[j - w[i]]);
            }
        }
        return memo2[C];
    }

    /**
     * 考虑用 [0..index]的物品，填充容积c的背包最大值
     *
     * @param w
     * @param v
     * @param index
     * @param c
     * @return
     */
    private static int bestValue(int[] w, int[] v, int index, int c) {
        if (index < 0 || c <= 0) {
            return 0;
        }
        if (memo[index][c] != 0) {
            return memo[index][c];
        }

        int res = bestValue(w, v, index - 1, c);
        if (c >= w[index]) {
            res = Math.max(res, v[index] + bestValue(w, v, index - 1, c - w[index]));
        }
        memo[index][c] = res;
        return res;
    }
}
