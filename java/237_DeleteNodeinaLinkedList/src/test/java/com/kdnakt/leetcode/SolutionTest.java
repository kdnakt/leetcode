package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(9);

        sol.deleteNode(node.next);
        assertEquals(4, node.val);
        assertEquals(1, node.next.val);
        assertEquals(9, node.next.next.val);
        assertNull(node.next.next.next);
    }

    @Test
    public void testExample2() {
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(9);

        sol.deleteNode(node.next.next);
        assertEquals(4, node.val);
        assertEquals(5, node.next.val);
        assertEquals(9, node.next.next.val);
        assertNull(node.next.next.next);
    }

    @Test
    public void testExample4() {
        ListNode node = new ListNode(0);
        node.next = new ListNode(1);

        sol.deleteNode(node);
        assertEquals(1, node.val);
        assertNull(node.next);
    }

    @Test
    public void test_2013_delete2_returns013() {
        ListNode node = new ListNode(2);
        node.next = new ListNode(0);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(3);

        sol.deleteNode(node);
        assertEquals(0, node.val);
        assertEquals(1, node.next.val);
        assertEquals(3, node.next.next.val);
        assertNull(node.next.next.next);
    }
    
}
