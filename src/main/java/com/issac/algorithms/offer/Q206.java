package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-23
 * @desc:
 */
public class Q206 {
    public static ListNode solution(ListNode node) {
        if (node == null) {
            return null;
        }
        ListNode pre = null, cur = node, next = cur.next;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node = Tool.createLinkedList(new int[]{1, 2, 3, 4, 5}, 5);
        Tool.printLinkedList(node);

        Tool.printLinkedList(solution(node));
    }
}
