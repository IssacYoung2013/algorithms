package com.issac.algorithms.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: ywy
 * @date: 2021-02-22
 * @desc:
 */
public class Q454 {
    public int solution(int[] a, int[] b, int[] c, int[] d) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < d.length; j++) {
                if (map.containsKey(c[i] + d[j])) {
                    Integer val = map.get(c[i] + d[j]);
                    map.put(c[i] + d[j], val++);
                } else {
                    map.put(c[i] + d[j], 1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (map.containsKey(0 - a[i] - b[j])) {
                    res += map.get(0 - a[i] - b[j]);
                }
            }
        }
        return res;
    }
}
