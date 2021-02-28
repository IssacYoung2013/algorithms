package com.issac.algorithms.offer2.array;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc: 回文字符串
 */
public class Q125 {

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j && i < s.length() - 1 && j >= 0) {
            if (isValid(s.charAt(i)) && isValid(s.charAt(j))) {
                if (!charEq(s.charAt(i), s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            } else if (!isValid(s.charAt(i))) {
                i++;
            } else if ((!isValid(s.charAt(j)))) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    private boolean isValid(int x) {
        return isChar(x) || isNumber(x);
    }

    private boolean isChar(int x) {
        return (x >= ((int) 'a') && x <= ((int) 'z')) ||
                (x >= ((int) 'A') && x <= ((int) 'Z'));
    }

    private boolean isNumber(int x) {
        return (x >= ((int) '0') && x <= ((int) '9'));
    }

    public boolean charEq(int a, int b) {
        if (isChar(a) && isChar(b)) {
            return a == b || Math.abs(a - b) == 32;
        }
        return a == b;
    }

    public static void main(String[] args) {
        System.out.println(new Q125().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new Q125().isPalindrome("race a car"));
        System.out.println(new Q125().isPalindrome("8V8K;G;K;V;"));

    }
}
