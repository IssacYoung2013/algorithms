package com.issac.algorithms.offer2.array;

import java.util.Arrays;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc: reverse vowels of a string
 */
public class Q345 {
    char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public void reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int i = 0, j = charArray.length - 1;
        while (i < j) {
            if (isVowels(charArray[i]) && isVowels(charArray[j])) {
                if (charArray[i] != charArray[j]) {
                    char c = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = c;
                }
                i++;
                j--;
            } else if (!isVowels(charArray[i])) {
                i++;
            } else if (!isVowels(charArray[j])) {
                j--;
            }
        }
        s = new String(charArray);
    }

    private boolean isVowels(char x) {
        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i] == x) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String s = "lettcode";
        new Q345().reverseVowels(s);
        System.out.println(s);
    }
}
