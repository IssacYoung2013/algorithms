package com.issac.algorithms.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ywy
 * @date: 2021-02-24
 * @desc:
 */
public class Q257 {
    public static List<String> solution(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if (root == null) {
            return res;
        }
        if (root.left == null && root.right == null) {
            res.add(String.valueOf(root.data));
            return res;
        }
        List<String> leftPaths = solution(root.left);
        for (int i = 0; i < leftPaths.size(); i++) {
            res.add(root.data + "->" + leftPaths.get(i));
        }
        List<String> rightPaths = solution(root.right);
        for (int i = 0; i < rightPaths.size(); i++) {
            res.add(root.data + "->" + rightPaths.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
