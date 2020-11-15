package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        ListNode head = new ListNode(1, new ListNode(2));
        assertFalse(sol.isPalindrome(head));
    }

    @Test
    public void testExample2() {
        ListNode head = new ListNode(1, new ListNode(2,
                new ListNode(2, new ListNode(1))));
        assertTrue(sol.isPalindrome(head));
    }

}
