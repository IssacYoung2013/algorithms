package com.issac.algorithms.offer;

import java.util.Arrays;

import static com.issac.algorithms.offer.Tool.swap;

/**
 * @author: ywy
 * @date: 2021-02-21
 * @desc: remove duplicated from stored array
 */
public class Q26 {
    public static int[] solution(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[k] != arr[i]) {
                k++;
                arr[k] = arr[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 2})));
        System.out.println(Arrays.toString(solution(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4})));
    }
}
