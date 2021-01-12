package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        sol.firstBadVersion = 4;
        assertEquals(sol.firstBadVersion, sol.firstBadVersion(5));
    }

    @Test
    public void testExample2() {
        sol.firstBadVersion = 1;
        assertEquals(sol.firstBadVersion, sol.firstBadVersion(1));
    }

    @Test
    public void testExample3() {
        sol.firstBadVersion = 4;
        assertEquals(sol.firstBadVersion, sol.firstBadVersion(31));
    }

}
