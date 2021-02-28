package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-21
 * @desc: 打印最大的n位数，考虑大数
 */
public class Q17 {
    public static void printN(int n) {
        if (n <= 0) {
            return;
        }
        String res = "0";
        while (true) {
            boolean all9 = true;
            res = plus(res, 1);
            System.out.println(res);
            for (int i = 0; i < res.length(); i++) {
                if (res.charAt(i) != '9') {
                    all9 = false;
                    break;
                }
            }
            if (all9 && res.length() == n) {
                break;
            }
        }
    }

    private static String plus(String res, int i) {
        char[] charArray = res.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        charArray[res.length() - 1] += i;
        boolean flag = false;
        for (int j = charArray.length - 1; j >= 0; j--) {
            int a = charArray[j];
            if (flag) {
                a++;
                flag = false;
            }
            if (a > '9') {
                flag = true;
                a = a - '9' + '0' - 1;
            }
            stringBuilder.append((char) a);
        }
        if (flag) {
            stringBuilder.append('1');
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        printN(3);
    }
}
