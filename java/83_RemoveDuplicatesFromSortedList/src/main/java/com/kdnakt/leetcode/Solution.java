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

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode curr = head;
        ListNode next = head.next;
        while (next != null) {
            if (curr.val != next.val) {
                curr.next = next;
                curr = next;
            }
            next = next.next;
            curr.next = null;
        }
        return head;
    }

}
