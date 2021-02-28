package com.issac.algorithms.offer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author: ywy
 * @date: 2021-02-23
 * @desc:
 */
public class Q219 {

    public static boolean solution(int[] arr, int k) {
        LinkedList<Integer> set = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            } else {
                set.add(arr[i]);
            }
            if (set.size() == k + 1) {
                set.remove(arr[i-k]);
            }
        }
        return false;
    }
}
