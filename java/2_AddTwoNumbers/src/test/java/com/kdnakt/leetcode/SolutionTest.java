package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testVal() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        ListNode actual = sol.addTwoNumbers(l1, l2);
        assertEquals(expected.val, actual.val); 
    }

    @Test
    public void testNextVal() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        ListNode actual = sol.addTwoNumbers(l1, l2);
        assertEquals(expected.next.val, actual.next.val); 
    }

    @Test
    public void testNextNextVal() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        ListNode actual = sol.addTwoNumbers(l1, l2);
        assertEquals(expected.next.next.val, actual.next.next.val); 
    }

    @Test
    public void testBiggerThanIntCase() {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                        new ListNode(9, new ListNode(9))))))))));
        ListNode expected = new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,
                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,
                        new ListNode(0, new ListNode(0, new ListNode(1)))))))))));
        ListNode actual = sol.addTwoNumbers(l1, l2);
        assertEquals(expected.val, actual.val);
    }

    @Test
    public void testBiggerThanLongCase() {
        ListNode l1 = new ListNode(1, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,
                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,
                        new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,
                                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,
                                        new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,
                                                new ListNode(0, new ListNode(1)))))))))))))))))))))))))))))));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(6, new ListNode(6, new ListNode(4, new ListNode(0, new ListNode(0,
                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,
                        new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,
                                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,
                                        new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,
                                                new ListNode(0, new ListNode(1)))))))))))))))))))))))))))))));
        ListNode actual = sol.addTwoNumbers(l1, l2);
        assertEquals(expected.val, actual.val);
    }

}
