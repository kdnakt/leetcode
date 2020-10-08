package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals(1, sol.titleToNumber("A"));
    }

    @Test
    public void testExample2() {
        assertEquals(28, sol.titleToNumber("AB"));
    }

    @Test
    public void testExample3() {
        assertEquals(701, sol.titleToNumber("ZY"));
    }

    @Test
    public void testExample4() {
        assertEquals(1000, sol.titleToNumber("ALL"));
    }

    @Test
    public void testExample5() {
        assertEquals(52, sol.titleToNumber("AZ"));
    }

    @Test
    public void testExample6() {
        assertEquals(26, sol.titleToNumber("Z"));
    }

}
