package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        String s = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";
        assertEquals(expected, sol.reverseWords(s));
    }

    @Test
    public void testExample2() {
        String s = "God Ding";
        String expected = "doG gniD";
        assertEquals(expected, sol.reverseWords(s));
    }
}
