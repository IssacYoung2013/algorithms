package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-21
 * @desc: 数值的整数次方
 */
public class Q16 {
    public static int solution(int base, int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return base;
        }

        if (n % 2 == 0) {
            return solution(base, n / 2) * solution(base, n / 2);
        } else {
            return solution(base, n / 2) * solution(base, n / 2) * base;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(2,10));
    }
}
