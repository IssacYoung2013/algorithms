package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-19
 * @desc: 斐波拉契数列
 */
public class Q10 {
    public static int solution(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int l = 1, ll = 0;
        for (int i = 2; i <= n; i++) {
            int t = l + ll;
            ll = l;
            l = t;
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(solution(2));
        System.out.println(solution(5));
        System.out.println(solution(5));

    }
}
