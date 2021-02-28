package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-23
 * @desc:
 */
public class Q203 {
    public static ListNode solution(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

//        while (head != null && head.data == val) {
//            ListNode delNode = head;
//            head = delNode.next;
//            delNode = null;
//        }
//        if (head == null) {
//            return head;
//        }
        ListNode cur = dummyHead;
        while (cur.next != null) {
            if (cur.next.data == val) {
                ListNode delNode = cur.next;
                cur.next = delNode.next;
                delNode = null;
            } else {
                cur = cur.next;
            }
        }
        ListNode retNode= dummyHead.next;
        dummyHead = null;
        return retNode;
    }
}
