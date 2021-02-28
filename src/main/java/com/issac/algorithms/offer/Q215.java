package com.issac.algorithms.offer;

import java.util.Random;

import static com.issac.algorithms.offer.Tool.swap;

/**
 * @author: ywy
 * @date: 2021-02-21
 * @desc: 数组中第k大的元素
 */
public class Q215 {

    public static int solution(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, arr.length - k + 1);
    }

    public static int quickSelect(int[] arr, int l, int r, int index) {
        int q = randomPartition(arr, l, r);
        if (q == index) {
            return arr[q];
        } else {
            return q < index ? quickSelect(arr, q + 1, r, index) :
                    quickSelect(arr, l, q - 1, index);
        }
    }

    private static int randomPartition(int[] arr, int l, int r) {
        int i = new Random().nextInt(r - l + 1) + 1;
        swap(arr, l, i);
        return partition(arr, l, r);
    }

    private static int partition(int[] arr, int l, int r) {
        int x = arr[r], i = l - 1;
        for (int j = l; j < r; ++j) {
            if (arr[j] <= x) {
                swap(arr, ++i, j);
            }
        }
        swap(arr, i + 1, r);
        return i + 1;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6},4));
    }
}
