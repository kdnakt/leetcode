package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertTrue(sol.isPalindrome(121));
    }

    @Test
    public void testExample2() {
        assertFalse(sol.isPalindrome(-121));
    }

    @Test
    public void testExample3() {
        assertFalse(sol.isPalindrome(10));
    }

}
