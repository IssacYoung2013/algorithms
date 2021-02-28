package com.issac.algorithms.offer;

import java.util.Arrays;

import static com.issac.algorithms.offer.Tool.swap;

/**
 * @author: ywy
 * @date: 2021-02-21
 * @desc: Sort Colors
 */
public class Q75 {
    public static int[] solution(int[] arr) {
        int[] colors = {0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            assert arr[i] >= 0 && arr[i] <= 2;
            colors[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < colors[0]; i++) {
            arr[index++] = 0;
        }
        for (int i = 0; i < colors[1]; i++) {
            arr[index++] = 1;
        }
        for (int i = 0; i < colors[2]; i++) {
            arr[index++] = 2;
        }
        return arr;
    }

    public static int[] solution2(int[] arr) {
        int n = arr.length;
        // nums[0..zero] == 0
        int zero = -1;
        // nums[two..n-1] == 2
        int two = n;
        for (int i = 0; i < two; ) {
            if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 2) {
                swap(arr, i, --two);
            } else {
                assert arr[i] == 0;
                swap(arr, i++, ++zero);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(new int[]{2, 0, 2, 1, 1, 0})));
    }
}
