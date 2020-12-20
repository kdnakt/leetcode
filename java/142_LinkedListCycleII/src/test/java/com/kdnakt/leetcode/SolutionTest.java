package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        assertEquals(head.next, sol.detectCycle(head));
    }

    @Test
    public void testExample2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        assertEquals(head, sol.detectCycle(head));
    }

    @Test
    public void testExample3() {
        ListNode head = new ListNode(1);
        assertEquals(null, sol.detectCycle(head));
    }
}
