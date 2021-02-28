package com.issac.algorithms.offer;

import java.util.Stack;

/**
 * @author: ywy
 * @date: 2021-02-19
 * @desc: 两个栈实现一个队列
 */
public class Q7 {
    private static Stack<Integer> stack1 = new Stack<Integer>();
    private static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int i) {
        stack1.push(i);
    }

    public static int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(pop());
        }
    }
}
