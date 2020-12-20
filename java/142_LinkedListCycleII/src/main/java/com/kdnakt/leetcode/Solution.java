package com.kdnakt.leetcode;

import java.util.ArrayList;
import java.util.List;
/**
 * Given a linked list, return the node where the cycle begins.
 * If there is no cycle, return null.
 * There is a cycle in a linked list 
 * if there is some node in the list that can be reached again
 * by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node
 * that tail's next pointer is connected to.
 * Note that pos is not passed as a parameter.
 * 
 * Notice that you should not modify the linked list.
 */

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();
        while (head != null) {
            nodes.add(head);
            head = head.next;
            if (nodes.contains(head)) return head;
        }
        return null;
    }

}