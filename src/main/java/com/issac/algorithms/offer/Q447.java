package com.issac.algorithms.offer;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: ywy
 * @date: 2021-02-22
 * @desc:
 */
public class Q447 {
    public static int solution(Pair<Integer, Integer>[] points) {
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int j = 0; j < points.length; j++) {
                if (j != i) {
                    int dis = dis(points[i], points[j]);
                    if (map.containsKey(dis)) {
                        Integer count = map.get(dis);
                        map.put(dis, count + 1);
                    } else {
                        map.put(dis, 1);
                    }
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() >= 2) {
                    res += entry.getValue() * (entry.getValue() - 1);
                }
            }
        }
        return res;
    }

    private static int dis(Pair<Integer, Integer> x, Pair<Integer, Integer> y) {
        return (x.getKey() - y.getKey()) * (x.getKey() - y.getKey()) +
                (x.getValue() - y.getValue()) * (x.getValue() - y.getValue());
    }
}
