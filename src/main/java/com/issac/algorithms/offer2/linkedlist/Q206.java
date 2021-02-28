package com.issac.algorithms.offer2.linkedlist;

import com.issac.algorithms.offer.ListNode;
import com.issac.algorithms.offer.Tool;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = null, cur = head, next = head.next;
        while (cur != null && next != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node = Tool.createLinkedList(new int[]{1, 2, 3, 4, 5}, 5);
        ListNode node1 = new Q206().reverseList(node);
        Tool.printLinkedList(node1);
    }
}
