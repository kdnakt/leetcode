package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        String s = "abcdefg";
        int k = 2;
        assertEquals("bacdfeg", sol.reverseStr(s, k));
    }

    @Test
    public void testExample2() {
        String s = "abcd";
        int k = 2;
        assertEquals("bacd", sol.reverseStr(s, k));
    }
}
