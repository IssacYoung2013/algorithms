package com.issac.algorithms.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ywy
 * @date: 2021-02-25
 * @desc:
 */
public class Q46 {
    static List<List<Integer>> res = new ArrayList<List<Integer>>();
    static boolean[] used;

    public static List<List<Integer>> solution(int[] nums) {
        res.clear();
        if (nums.length == 0) {
            return res;
        }
        used = new boolean[nums.length];
        List<Integer> p = new ArrayList<Integer>();
        generatePermutation(nums, 0, p);
        return res;
    }

    public static void generatePermutation(int[] nums, int index, List<Integer> p) {
        if (index == nums.length) {
            res.add(new ArrayList<Integer>(p));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                p.add(nums[i]);
                used[i] = true;
                generatePermutation(nums, index + 1, p);
                // 回去
                p.remove(Integer.valueOf(nums[i]));
                used[i] = false;
            }
        }
        return;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}));
    }
}
