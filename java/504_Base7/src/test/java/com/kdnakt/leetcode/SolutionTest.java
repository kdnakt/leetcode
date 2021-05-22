package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int num = 100;
        assertEquals("202", sol.convertToBase7(num));
    }

    @Test
    public void testExample2() {
        int num = -7;
        assertEquals("-10", sol.convertToBase7(num));
    }

    @Test
    public void testExample3() {
        int num = 0;
        assertEquals("0", sol.convertToBase7(num));
    }
}
