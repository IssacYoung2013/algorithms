package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-23
 * @desc:
 */
public class QA19 {
    public static ListNode solution(ListNode head, int n) {
        assert n >= 0;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode p = dummyHead;
        ListNode q = dummyHead;
        for (int i = 0; i < n + 1; i++) {
            assert q != null;
            q = q.next;
        }
        while (q != null) {
            p = p.next;
            q = q.next;
        }

        ListNode delNode = p.next;
        p.next = delNode.next;
        delNode = null;
        return dummyHead.next;
    }
}
