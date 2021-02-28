package com.issac.algorithms.offer;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author: ywy
 * @date: 2021-02-24
 * @desc:
 */
public class Q104 {
    public static int solution(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(solution(root.left), solution(root.right)) + 1;
    }

    public static void main(String[] args) {

    }
}
