package com.issac.algorithms.offer;

import java.util.Arrays;

/**
 * @author: ywy
 * @date: 2021-02-21
 * @desc: move zero
 */
public class Q283 {
    public static int[] solution(int[] arr) {
        // [0..k)非0
        int k = 0;
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != k) {
                    swap(arr, k, i);
                }
                k++;
//                arr[k++] = arr[i];
            }
        }
//        for (int i = k; i < arr.length; i++) {
//            arr[i] = 0;
//        }
        return arr;
    }

    private static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 0, 2, 3, 0})));
    }
}
