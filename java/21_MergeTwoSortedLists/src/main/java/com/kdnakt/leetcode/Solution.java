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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode res;
        if (l1.val < l2.val) {
            res = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            res = new ListNode(l2.val);
            l2 = l2.next;
        }
        ListNode ans = res;
        ListNode next;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                next = new ListNode(l2.val);
                l2 = l2.next;
            } else if (l2 == null) {
                next = new ListNode(l1.val);
                l1 = l1.next;
            } else if (l1.val > l2.val) {
                next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                next = new ListNode(l1.val);
                l1 = l1.next;
            }
            res.next = next;
            res = next;
        }
        return ans;
    }
}