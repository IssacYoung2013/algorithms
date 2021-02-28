package com.issac.algorithms.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ywy
 * @date: 2021-02-26
 * @desc:
 */
public class Q77 {

    private static List<List<Integer>> res = new ArrayList<List<Integer>>();

    private static void generateCombinations(int n, int k, int start, List<Integer> p) {
        if (p.size() == k) {
            res.add(new ArrayList<Integer>(p));
            return;
        }
        // 还有 k-c.size()个空位，所以[i..n]至少有k-c.size()个元素
        // i 最多为 n - (k-c.size()) + 1
        for (int i = start; i <= n - (k-p.size()) + 1; i++) {
            p.add(i);
            generateCombinations(n, k, i + 1, p);
            p.remove(Integer.valueOf(i));
        }
    }

    public static List<List<Integer>> combination(int n, int k) {
        res.clear();
        if (n <= 0 || k <= 0 || k > n) {
            return res;
        }
        List<Integer> p = new ArrayList<Integer>();
        generateCombinations(n, k, 1, p);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(combination(3,2));
    }
}
