package com.issac.algorithms.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: ywy
 * @date: 2021-02-22
 * @desc: two sum
 */
public class Q1 {
    /**
     * 暴力
     *
     * @return
     */
    public static int[] solution(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                map.put(complement, i);
            }
        }
        return new int[]{-1, -1};
    }
}
