package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-21
 * @desc: 最短连续子数组>s
 */
public class Q209 {
    /**
     * 暴力解决：遍历所有的连续子数组[i,j]，大量重复计算
     * 计算其和sum，验证 sum >= 3
     * 时间复杂度O(n^3)
     *
     * @return
     */
    public static int solution(int[] arr, int target) {
        // [l..r]滑动窗口
        int l = 0, r = -1;
        int sum = 0;
        int res = arr.length + 1;
        while (l < arr.length) {
            if (r + 1 < arr.length && sum < target) {
                sum += arr[++r];
            } else {
                sum -= arr[l++];
            }

            if (sum >= target) {
                res = Math.min(res, r - l + 1);
            }
        }
        if (res == arr.length + 1) {
            return 0;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {2,3,1,2,4,3},7));
    }
}
