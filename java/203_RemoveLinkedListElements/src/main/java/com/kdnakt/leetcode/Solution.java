package com.kdnakt.leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode res = null;
        ListNode curr = null;
        while (head != null) {
            if (head.val != val) {
                if (res == null) {
                    res = curr = head;
                } else {
                    curr = curr.next = head;
                }
            }
            head = head.next;
        }
        if (curr != null) curr.next = null;
        return res;
    }
}