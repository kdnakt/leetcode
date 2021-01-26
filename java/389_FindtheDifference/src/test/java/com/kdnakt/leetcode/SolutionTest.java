package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        String s = "abcd", t = "abcde";
        assertEquals('e', sol.findTheDifference(s, t));
    }

    @Test
    public void testExample2() {
        String s = "", t = "y";
        assertEquals('y', sol.findTheDifference(s, t));
    }

    @Test
    public void testExample3() {
        String s = "a", t = "aa";
        assertEquals('a', sol.findTheDifference(s, t));
    }

    @Test
    public void testExample4() {
        String s = "ae", t = "aea";
        assertEquals('a', sol.findTheDifference(s, t));
    }

}
