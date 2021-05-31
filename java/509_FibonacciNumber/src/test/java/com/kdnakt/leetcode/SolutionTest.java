package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int n = 2;
        assertEquals(1, sol.fib(n));
    }

    @Test
    public void testExample2() {
        int n = 3;
        assertEquals(2, sol.fib(n));
    }

    @Test
    public void testExample3() {
        int n = 4;
        assertEquals(3, sol.fib(n));
    }
}
