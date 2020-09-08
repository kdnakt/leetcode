package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(4))))));
        ListNode actual = sol.mergeTwoLists(l1, l2);
        do {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        } while (expected != null || actual != null);
        assertTrue(expected == null && actual == null);
    }

    @Test
    public void testLongerL1() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1);
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(4))));
        ListNode actual = sol.mergeTwoLists(l1, l2);
        do {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        } while (expected != null || actual != null);
        assertTrue(expected == null && actual == null);
    }

    @Test
    public void testLongerL2() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(4))));
        ListNode actual = sol.mergeTwoLists(l1, l2);
        do {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        } while (expected != null || actual != null);
        assertTrue(expected == null && actual == null);
    }

    @Test
    public void testL1GreaterThanL2() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1);
        ListNode expected = new ListNode(1, new ListNode(2));
        ListNode actual = sol.mergeTwoLists(l1, l2);
        do {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        } while (expected != null || actual != null);
        assertTrue(expected == null && actual == null);
    }

}
