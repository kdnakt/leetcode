package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        String s = "Hello, my name is John";
        assertEquals(5, sol.countSegments(s));
    }

    @Test
    public void testExample2() {
        String s = "Hello";
        assertEquals(1, sol.countSegments(s));
    }

    @Test
    public void testExample3() {
        String s = "love live! mu'sic forever";
        assertEquals(4, sol.countSegments(s));
    }

    @Test
    public void testExample4() {
        String s = "";
        assertEquals(0, sol.countSegments(s));
    }
}
