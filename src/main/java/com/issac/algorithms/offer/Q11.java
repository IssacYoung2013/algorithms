package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-20
 * @desc: 旋转数组的最小数字
 */
public class Q11 {
    public static int solution(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int start = 0, end = arr.length - 1;
        while (end - start != 1) {
            int mid = (start + end) / 2;
            if (arr[mid] >= arr[start]) {
                start = mid;
            }
            if (arr[mid] <= arr[end]) {
                end = mid;
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {3,4,5,1,2}));
        System.out.println(solution(new int[] {2,2,2,0,1}));
    }
}
