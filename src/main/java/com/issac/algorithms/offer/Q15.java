package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-20
 * @desc: 二进制1的个数
 */
public class Q15 {
    public static int solution(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
}
