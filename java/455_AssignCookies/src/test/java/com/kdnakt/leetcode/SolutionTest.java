package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] g = {1,2,3}, s = {1,1};
        assertEquals(1, sol.findContentChildren(g, s));
    }

    @Test
    public void testExample2() {
        int[] g = {1,2}, s = {1,2,3};
        assertEquals(2, sol.findContentChildren(g, s));
    }

    @Test
    public void testExample3() {
        int[] g = {1,2}, s = {};
        assertEquals(0, sol.findContentChildren(g, s));
    }
}
