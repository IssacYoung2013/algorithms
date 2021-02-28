package com.issac.algorithms.offer;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: ywy
 * @date: 2021-02-23
 * @desc:
 */
public class Q102 {
    public static List<List<Integer>> solution(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) {
            return res;
        }
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<Pair<TreeNode, Integer>>();
        queue.offer(new Pair<TreeNode, Integer>(root, 0));
        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> pair = queue.poll();
            TreeNode node = pair.getKey();
            int level = pair.getValue();
            if (level == res.size()) {
                res.add(new ArrayList<Integer>());
            }
            res.get(level).add(node.data);
            if (node.left != null) {
                queue.offer(new Pair<TreeNode, Integer>(node.left, level + 1));
            }
            if (node.right != null) {
                queue.offer(new Pair<TreeNode, Integer>(node.right, level + 1));
            }
        }
        return res;
    }
}
