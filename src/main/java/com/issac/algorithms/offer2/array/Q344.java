package com.issac.algorithms.offer2.array;

import com.issac.algorithms.offer.Q343;

import java.util.Arrays;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc: reverse string
 */
public class Q344 {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            if (s[i] != s[j]) {
                char c = s[i];
                s[i] = s[j];
                s[j] = c;
            }
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[] chars = {
                'h', 'e', 'l', 'l', 'o'
        };
        new Q344().reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }
}
