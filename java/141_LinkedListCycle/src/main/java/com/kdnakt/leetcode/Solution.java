package com.kdnakt.leetcode;

import java.util.ArrayList;
import java.util.List;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 * 
 * Constraints:
 * The number of the nodes in the list is in the range [0, 10^4].
 * -10^5 <= Node.val <= 10^5
 * pos is -1 or a valid index in the linked-list.
 */
public class Solution {
    List<ListNode> nodes;
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        nodes = new ArrayList<>();
        return solve(head.next);
    }

    boolean solve(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return false;
        if (nodes.contains(head)) {
            return true;
        } else {
            nodes.add(head);
        }
        return solve(head.next);
    }
}