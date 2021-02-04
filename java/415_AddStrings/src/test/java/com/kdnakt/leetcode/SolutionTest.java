package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals("0", sol.addStrings("0", "0"));
    }

    @Test
    public void testExample2() {
        assertEquals("1", sol.addStrings("0", "1"));
    }

    @Test
    public void testExample3() {
        assertEquals("10000000000001", sol.addStrings("10000000000000", "1"));
    }

    @Test
    public void testExample4() {
        assertEquals("10", sol.addStrings("1", "9"));
    }
}
