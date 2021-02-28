package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-21
 * @desc:
 */
public class Q19 {
    public static void solution(ListNode head, ListNode needDelete) {
        if (needDelete.next != null) {
            ListNode next = needDelete.next.next;
            needDelete.data = next.data;
            needDelete.next = next.next;
        } else {
            ListNode cursor = head;
            while (cursor.next != null) {
                if (cursor.next == needDelete) {
                    break;
                }
                cursor = cursor.next;
            }
            if (cursor == null) {
                return;
            }
            cursor.next = needDelete.next;
        }
    }
}
