package com.kdnakt.leetcode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 
 * Write a function to delete a node
 * in a singly-linked list.
 * You will not be given access to the head of the list,
 * instead you will be given access to the node
 * to be deleted directly.
 * It is guaranteed that the node to be deleted
 * is not a tail node in the list.
 * 
 * Constraints:
 * The number of the nodes in the given list is in the range [2, 1000].
 * -1000 <= Node.val <= 1000
 * The value of each node in the list is unique.
 * The node to be deleted is in the list and is not a tail node
 */
public class Solution {

    public void deleteNode(ListNode node) {
        while (node != null && node.next != null) {
            node.val = node.next.val;
            ListNode last = node;
            node = node.next;
            if (node.next == null) last.next = null;
        }
    }
}
