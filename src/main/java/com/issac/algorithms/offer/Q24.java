package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-23
 * @desc:
 */
public class Q24 {
    public static ListNode solution(ListNode node) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = node;
        ListNode p = dummyHead;
        while (p.next != null && p.next.next != null) {
            ListNode node1 = p.next;
            ListNode node2 = node1.next;
            ListNode next = node2.next;

            node2.next = node1;
            node1.next = next;
            p.next = node2;

            p = node1;
        }
        ListNode retNode = dummyHead.next;
        dummyHead = null;
        return retNode;
    }
}
