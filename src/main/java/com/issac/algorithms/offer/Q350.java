package com.issac.algorithms.offer;

import java.util.*;

/**
 * @author: ywy
 * @date: 2021-02-22
 * @desc: 两数组的交集
 */
public class Q350 {

    public static Integer[] solution(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                Integer val = map.get(arr1[i]);
                map.put(arr1[i], val++);
            } else {
                map.put(arr1[i], 1);
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                Integer val = map.get(arr2[i]);
                if (val > 0) {
                    result.add(arr2[i]);
                    map.put(arr2[i],--val);
                }
            }
        }
        return result.toArray(new Integer[]{});
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1,2,3,2},new int[]{2,2,3})));
    }
}
