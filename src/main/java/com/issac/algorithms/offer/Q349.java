package com.issac.algorithms.offer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author: ywy
 * @date: 2021-02-21
 * @desc: 两数组的公共元素
 */
public class Q349 {
    public static Integer[] solution(int[] arr1, int[] arr2) {
        Set<Integer> record = new LinkedHashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            record.add(arr1[i]);
        }
        Set<Integer> result = new LinkedHashSet<Integer>();
        for (int i = 0; i < arr2.length; i++) {
            if (record.contains(arr2[i])) {
                result.add(arr2[i]);
            }
        }
        return result.toArray(new Integer[result.size()]);
    }
}
