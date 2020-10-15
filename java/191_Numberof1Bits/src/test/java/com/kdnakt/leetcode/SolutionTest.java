package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample0() {
        assertEquals(1, sol.hammingWeight(2));
    }

    @Test
    public void testExample1() {
        assertEquals(3, sol.hammingWeight(11));
    }

    @Test
    public void testExample2() {
        assertEquals(1, sol.hammingWeight(128));
    }

    @Test
    public void testExample3() {
        assertEquals(31, sol.hammingWeight(-3));
    }

    @Test
    public void testExample4() {
        assertEquals(32, sol.hammingWeight(-1));
    }

    @Test
    public void testExample5() {
        assertEquals(16, sol.hammingWeight(-1431655766));
    }

    @Test
    public void testExample6() {
        assertEquals(16, sol.hammingWeight(-1431677611));
    }

    @Test
    public void testExample7() {
        assertEquals(1, sol.hammingWeight(-2147483648));
    }

    @Test
    public void testExample8() {
        assertEquals(16, sol.hammingWeight(-16711936));
    }

}
