package com.issac.algorithms.offer2.array;

import java.util.*;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>(), set2 = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        list.retainAll(set2);
        set1.addAll(list);
        return set1.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Q349().intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}
