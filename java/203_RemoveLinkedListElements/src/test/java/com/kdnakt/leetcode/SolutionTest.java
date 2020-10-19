package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        ListNode head = new ListNode(1, new ListNode(2,
                new ListNode(6, new ListNode(3, new ListNode(4,
                new ListNode(5, new ListNode(6)))))));
        int val = 6;
        ListNode expected = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode actual = sol.removeElements(head, val);
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected);
        assertNull(actual);
    }

    @Test
    public void testExample2() {
        ListNode head = new ListNode(1);
        int val = 1;
        ListNode actual = sol.removeElements(head, val);
        assertNull(actual);
    }
}
