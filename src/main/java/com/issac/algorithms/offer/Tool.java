package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-19
 * @desc:
 */
public class Tool {
    public TreeNode generate(int n) {
        TreeNode root = new TreeNode(1);

        return root;
    }

    public static void printPre(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        printPre(node.left);
        printPre(node.right);
    }

    public static void printMid(TreeNode node) {
        if (node == null) {
            return;
        }
        printMid(node.left);
        System.out.println(node.data);
        printMid(node.right);
    }

    public static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static ListNode createLinkedList(int[] arr, int n) {
        if (n == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < n; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ->");
            cur = cur.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
}
