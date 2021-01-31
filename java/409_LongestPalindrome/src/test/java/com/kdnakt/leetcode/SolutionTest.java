package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        String s = "abccccdd";
        assertEquals(7, sol.longestPalindrome(s));
    }

    @Test
    public void testExample2() {
        String s = "a";
        assertEquals(1, sol.longestPalindrome(s));
    }

    @Test
    public void testExample3() {
        String s = "bb";
        assertEquals(2, sol.longestPalindrome(s));
    }

}
