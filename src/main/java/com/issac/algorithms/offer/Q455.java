package com.issac.algorithms.offer;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q455 {

    static int solution(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int si = s.length - 1, gi = g.length - 1;
        int res = 0;
        while (gi >= 0 && si >= 0) {
            if (s[si] >= g[gi]) {
                res++;
                si--;
                gi--;
            } else {
                gi--;
            }
        }
        return res;
    }
}
