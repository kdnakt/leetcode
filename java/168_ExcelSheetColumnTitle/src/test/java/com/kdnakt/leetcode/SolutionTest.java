package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals("A", sol.convertToTitle(1));
    }

    @Test
    public void testExample2() {
        assertEquals("AB", sol.convertToTitle(28));
    }

    @Test
    public void testExample3() {
        assertEquals("ZY", sol.convertToTitle(701));
    }

    @Test
    public void testExample4() {
        assertEquals("ALL", sol.convertToTitle(1000));
    }

    @Test
    public void testExample5() {
        assertEquals("AZ", sol.convertToTitle(52));
    }

    @Test
    public void testExample6() {
        assertEquals("Z", sol.convertToTitle(26));
    }

}
