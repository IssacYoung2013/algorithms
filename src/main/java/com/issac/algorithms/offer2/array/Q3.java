package com.issac.algorithms.offer2.array;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q3 {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        char[] chars = s.toCharArray();
        int i = 0, j = -1;
        int res = 0;
        while (i < chars.length) {
            if (j + 1 < chars.length && freq[chars[j + 1]] == 0) {
                freq[chars[++j]]++;
            } else {
                freq[chars[i++]]--;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(new Q3().lengthOfLongestSubstring(s));
    }
}
