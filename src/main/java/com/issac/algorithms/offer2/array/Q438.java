package com.issac.algorithms.offer2.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        int[] freq = new int[256];
        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i)]++;
        }
        int[] freq2 = new int[256];
        int l = 0, r = -1;
        while (l < s.length()) {
            if (r + 1 < s.length() && freq2[s.charAt(r + 1)] != 0) {
                freq2[s.charAt(++r)]--;
            }
            if ((r - l + 1) == p.length()) {

            }
        }
        return res;
    }
}
