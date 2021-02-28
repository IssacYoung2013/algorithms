package com.issac.algorithms.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ywy
 * @date: 2021-02-25
 * @desc:
 */
public class QA17 {
    static List<String> res = new ArrayList<String>();

    public static List<String> solution(String str) {
        res.clear();
        if (str == null || "" == str) {
            return res;
        }
        findCombination(str, 0, "");
        return res;
    }

    static String[] letterMap = {
            " ",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    static void findCombination(String digits, int index, String str) {
        System.out.println(index +":"+str);
        if (index == digits.length()) {
            //保存s
            res.add(str);
            return;
        }
        char c = digits.charAt(index);
        assert (c >= '0' && c <= '9' && c != '1');
        String letters = letterMap[c - '0'];
        for (int i = 0; i < letters.length(); i++) {
            findCombination(digits, index + 1, str + letters.charAt(i));
        }
        return;
    }

    public static void main(String[] args) {
        System.out.println(solution("234"));
    }
}
