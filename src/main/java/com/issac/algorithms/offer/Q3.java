package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-21
 * @desc: 最长不重复子字符串
 */
public class Q3 {
    /**
     * 滑动窗口
     *
     * @param str
     * @return
     */
    public static int solution(String str) {
        //assic
        int[] freq = new int[256];
        int l = 0, r = -1;
        int res = 0;
        while (l < str.length()) {
            if (r + 1 < str.length() && freq[str.charAt(r + 1)] == 0) {
                freq[str.charAt(++r)]++;
            } else {
                freq[str.charAt(l++)]--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
