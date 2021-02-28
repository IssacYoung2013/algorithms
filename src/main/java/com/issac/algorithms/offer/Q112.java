package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-24
 * @desc:
 */
public class Q112 {
    public static boolean solution(TreeNode root,int sum) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null) {
            return root.data == sum;
        }
        if(solution(root.left,sum - root.data)) {
            return true;
        }
        if(solution(root.right,sum - root.data)) {
            return true;
        }
        return false;
    }
}
