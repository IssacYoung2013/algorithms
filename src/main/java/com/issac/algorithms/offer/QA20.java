package com.issac.algorithms.offer;

import java.util.Stack;

/**
 * @author: ywy
 * @date: 2021-02-23
 * @desc:
 */
public class QA20 {
    public static boolean solution(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                char pop = stack.pop();
                char match = '\0';
                if (c == ')') {
                    match = '(';
                } else if (c == '}') {
                    match = '{';
                } else if (c == ']') {
                    match = '[';
                }
                if(pop != match) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solution("{[]}()"));
    }
}
