package com.kdnakt.leetcode;

public class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode res = new ListNode(head.val);
        while (head.next != null) {
            res = new ListNode(head.next.val, res);
            head = head.next;
        }
        return res;
    }
}
