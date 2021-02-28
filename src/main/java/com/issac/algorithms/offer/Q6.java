package com.issac.algorithms.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: ywy
 * @date: 2021-02-19
 * @desc: 重建二叉树
 */
public class Q6 {
    public static TreeNode solution(int[] pre, int[] mid) {
        Map<Integer, Integer> preIndex = new HashMap<Integer, Integer>();
        for (int i = 0; i < pre.length; i++) {
            preIndex.put(pre[i], i);
        }
        return buildTree(preIndex, mid, 0, pre.length - 1);
    }

    private static TreeNode buildTree(Map<Integer, Integer> preIndex, int[] mid, int start, int end) {
        if (start == end) {
            return new TreeNode(mid[start]);
        }
        int rootIndex = start;
        for (int i = start; i <= end; i++) {
            if (preIndex.get(mid[i]) < preIndex.get(mid[rootIndex])) {
                rootIndex = i;
            }
        }
        TreeNode root = new TreeNode(mid[rootIndex]);
        if (start <= rootIndex - 1) {
            root.left = buildTree(preIndex, mid, start, rootIndex - 1);
        }
        if (rootIndex + 1 <= end) {
            root.right = buildTree(preIndex, mid, rootIndex + 1, end);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode node = solution(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        Tool.printPre(node);
        Tool.printMid(node);
    }
}
