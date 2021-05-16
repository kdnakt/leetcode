package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        String[] expected = {"Alaska","Dad"};
        assertArrayEquals(expected, sol.findWords(words));
    }

    @Test
    public void testExample2() {
        String[] words = {"omk"};
        String[] expected = {};
        assertArrayEquals(expected, sol.findWords(words));
    }

    @Test
    public void testExample3() {
        String[] words = {"adsdf","sfd"};
        String[] expected = {"adsdf","sfd"};
        assertArrayEquals(expected, sol.findWords(words));
    }
}
