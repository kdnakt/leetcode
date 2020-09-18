package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode expected = new ListNode(1, new ListNode(2));
        ListNode actual = sol.deleteDuplicates(head);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertNull(actual.next.next);
    }

    @Test
    public void testExample2() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(3)))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode actual = sol.deleteDuplicates(head);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
        assertNull(actual.next.next.next);
    }

    @Test
    public void testOnlyOneNode() {
        ListNode head = new ListNode(9);
        ListNode expected = new ListNode(9);
        ListNode actual = sol.deleteDuplicates(head);
        assertEquals(expected.val, actual.val);
        assertNull(actual.next);
    }

    @Test
    public void testNoDup() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode actual = sol.deleteDuplicates(head);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
        assertNull(actual.next.next.next);
    }

    @Test
    public void testNull() {
        ListNode head = null;
        assertNull(sol.deleteDuplicates(head));
    }

}
