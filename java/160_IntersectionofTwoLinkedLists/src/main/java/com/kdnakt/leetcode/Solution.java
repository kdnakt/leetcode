package com.kdnakt.leetcode;

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr = headA;
        while (curr != null) {
            ListNode currB = headB;
            while (currB != null) {
                if (currB.equals(curr)) return curr;
                currB = currB.next;
            }
            curr = curr.next;
        }
        return null;
    }

}
