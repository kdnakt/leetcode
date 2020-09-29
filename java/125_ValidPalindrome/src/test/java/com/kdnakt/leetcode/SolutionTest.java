package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertTrue(sol.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testExample2() {
        assertFalse(sol.isPalindrome("race a car"));
    }

    @Test
    public void testEmpty() {
        assertTrue(sol.isPalindrome(""));
    }

}
