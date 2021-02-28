package com.issac.algorithms.offer2.array;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q76 {
    public String minWindow(String s, String t) {
        if (s == null || s == "" || t == null || t == "") {
            return "";
        }
        int[] need = new int[128];
        // 记录需要的字符个数
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }
        // l是当前左边界，r是当前右边界，size记录窗口大小，count是需求的字符个数，start是最小覆盖子串的index
        int l = 0, r = 0, size = Integer.MAX_VALUE, count = t.length(), start = 0;
        // 遍历所有字符
        while (r < s.length()) {
            char c = s.charAt(r);
            if (need[c] > 0) {
                // 需要字符c
                count--;
            }
            // 把右边字符加入窗口
            need[c]--;
            if (count == 0) {
                // 窗口以及包含所有字符
                while (l < r && need[s.charAt(l)] < 0) {
                    //释放出右边移动出窗口的字符
                    need[s.charAt(l)]++;
                    // 指针右移
                    l++;
                }
                if (r - l + 1 < size) {
                    size = r - l + 1;
                    // 记录下最小值时候的开始位置
                    start = l;
                }
                // l向右移动后不满足，重新开始循环
                need[s.charAt(l)]++;
                l++;
                count++;
            }
            r++;
        }
        return size == Integer.MAX_VALUE ? "" : s.substring(start, start + size);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(new Q76().minWindow(s, t));
    }
}
