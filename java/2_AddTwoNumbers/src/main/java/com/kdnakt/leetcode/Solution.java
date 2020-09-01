package com.kdnakt.leetcode;

import java.math.BigInteger;
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
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String sum = new BigInteger(toNumber(l1, "")).add(new BigInteger(toNumber(l2, ""))).toString();
        return toList(sum.split(""), sum.length() - 1);
    }

    public String toNumber(ListNode node, String acc) {
        if (node.next == null) {
            return node.val + acc;
        }
        return toNumber(node.next, acc) + node.val;
    }

    public ListNode toList(String[] values, int curr) {
        if (curr == 0) return new ListNode(Integer.valueOf(values[0]).intValue());
        return new ListNode(Integer.valueOf(values[curr]).intValue(), toList(values, curr - 1));
    }
}