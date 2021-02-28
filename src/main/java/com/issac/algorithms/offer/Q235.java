package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-25
 * @desc:
 */
public class Q235 {

    public static TreeNode solution(TreeNode root, TreeNode p, TreeNode q) {

        assert p != null && q != null;
        if (root == null) {
            return null;
        }

        if (p.data < root.data && q.data < root.data) {
            return solution(root.left, p, q);
        }
        if (p.data > root.data && q.data > root.data) {
            return solution(root.left, p, q);
        }
        return root;
    }
}
