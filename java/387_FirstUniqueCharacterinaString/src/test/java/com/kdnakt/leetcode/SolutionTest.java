package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals(0, sol.firstUniqChar("leetcode"));
    }

    @Test
    public void testExample2() {
        assertEquals(2, sol.firstUniqChar("loveleetcode"));
    }

    @Test
    public void testExample3() {
        assertEquals(-1, sol.firstUniqChar("lovelove"));
    }

    @Test
    public void testExample4() {
        assertEquals(-1, sol.firstUniqChar(""));
    }

    @Test
    public void testFailedSubmission() {
        assertEquals(8, sol.firstUniqChar("dddccdbba"));
    }
}
