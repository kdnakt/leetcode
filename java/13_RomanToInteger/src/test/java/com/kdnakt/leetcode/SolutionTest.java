package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals(3, sol.romanToInt("III"));
    }

    @Test
    public void testExample2() {
        assertEquals(4, sol.romanToInt("IV"));
    }

    @Test
    public void testExample3() {
        assertEquals(9, sol.romanToInt("IX"));
    }

    @Test
    public void testExample4() {
        assertEquals(58, sol.romanToInt("LVIII"));
    }

    @Test
    public void testExample5() {
        assertEquals(1994, sol.romanToInt("MCMXCIV"));
    }
}
