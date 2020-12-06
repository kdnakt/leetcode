package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3,
                new ListNode(2, new ListNode(1)))));
        ListNode actual = sol.reverseList(head);
        ListNode curr = actual;
        while (curr != null) {
            assertEquals(expected.val, curr.val);
            curr = curr.next;
            expected = expected.next;
        }
        assertNull(expected);
    }

    @Test
    public void testExample2() {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode expected = new ListNode(2, new ListNode(1));
        ListNode actual = sol.reverseList(head);
        ListNode curr = actual;
        while (curr != null) {
            assertEquals(expected.val, curr.val);
            curr = curr.next;
            expected = expected.next;
        }
        assertNull(expected);
    }

    @Test
    public void testExample3() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode expected = new ListNode(3, new ListNode(2, new ListNode(1)));
        ListNode actual = sol.reverseList(head);
        ListNode curr = actual;
        while (curr != null) {
            assertEquals(expected.val, curr.val);
            curr = curr.next;
            expected = expected.next;
        }
        assertNull(expected);
    }

}
