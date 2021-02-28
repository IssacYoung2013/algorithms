package com.issac.algorithms.offer;

import java.util.Arrays;

import static com.issac.algorithms.offer.Tool.swap;

/**
 * @author: ywy
 * @date: 2021-02-21
 * @desc: remove
 */
public class Q27 {
    public static int[] solution(int[] arr, int val) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                if (i != k) {
                    swap(arr, i, k);
                }
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 2, 3}, 3)));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2)));
    }
}
