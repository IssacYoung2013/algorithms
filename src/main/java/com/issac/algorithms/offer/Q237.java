package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-23
 * @desc:
 */
public class Q237 {
    public static ListNode solution(ListNode node) {
        if(node == null) {
            return null;
        }
        if(node.next == null) {
            node = null;
            return node;
        }
        if (node.next != null) {
            node.data = node.next.data;
            ListNode deleteNode = node.next;
            node.next = deleteNode.next;
        }
        return node;
    }
}
