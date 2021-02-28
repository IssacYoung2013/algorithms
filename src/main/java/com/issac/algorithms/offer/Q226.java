package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-24
 * @desc:
 */
public class Q226 {
    public static TreeNode solution(TreeNode root) {
        if(root == null) {
            return null;
        }
        solution(root.left);
        solution(root.right);
        swap(root.left,root.right);
        return root;
    }
    private static void swap(TreeNode left,TreeNode right) {
        TreeNode t = left;
        left = right;
        right = t;
    }
}
