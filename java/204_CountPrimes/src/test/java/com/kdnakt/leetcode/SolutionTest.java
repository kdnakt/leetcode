package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals(4, sol.countPrimes(10));
    }

    @Test
    public void testExample2() {
        assertEquals(0, sol.countPrimes(0));
    }

    @Test
    public void testExample3() {
        assertEquals(0, sol.countPrimes(1));
    }

    @Test
    public void testExample4() {
        assertEquals(41537, sol.countPrimes(499979));
    }

    @Test
    public void testExample5() {
        assertEquals(1, sol.countPrimes(3));
    }

}
