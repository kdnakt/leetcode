package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals("100", sol.addBinary("11", "1"));
    }

    @Test
    public void testExample2() {
        assertEquals("10101", sol.addBinary("1010", "1011"));
    }

    @Test
    public void testAddZero() {
        assertEquals("1010", sol.addBinary("1010", "0"));
    }

}
