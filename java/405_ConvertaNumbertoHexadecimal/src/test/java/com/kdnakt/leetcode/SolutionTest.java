package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals("1a", sol.toHex(26));
    }

    @Test
    public void testExample2() {
        assertEquals("ffffffff", sol.toHex(-1));
    }

    @Test
    public void testExample3() {
        assertEquals("9", sol.toHex(9));
    }

    @Test
    public void testExample4() {
        assertEquals("a", sol.toHex(10));
    }

    @Test
    public void testExample5() {
        assertEquals("ff", sol.toHex(255));
    }

    @Test
    public void testExample6() {
        assertEquals("100", sol.toHex(256));
    }
}
