package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-24
 * @desc:
 */
public class Q437 {
    public static int solution(TreeNode root, int sum) {
        // 以root为根节点的二叉树，寻找和为sum的路径，返回路径的个数
        if (root == null) {
            return 0;
        }
        int res = findPath(root, sum);
        res += solution(root.left, sum);
        res += solution(root.right, sum);
        return res;
    }

    /**
     * 以node为根节点，寻找包含node的路径，和为sum
     *
     * @param node
     * @param sum
     * @return
     */
    private static int findPath(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        int res = 0;
        if (node.data == sum) {
            res += 1;
        }
        res += findPath(node.left, sum - node.data);
        res += findPath(node.right, sum - node.data);
        return res;
    }
}
