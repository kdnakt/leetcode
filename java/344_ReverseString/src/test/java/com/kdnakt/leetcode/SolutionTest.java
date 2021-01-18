package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        char[] s = {'h','e','l','l','o'};
        char[] expected = {'o','l','l','e','h'};
        sol.reverseString(s);
        assertArrayEquals(expected, s);
    }

    @Test
    public void testExample2() {
        char[] s = {'h','e','l','l'};
        char[] expected = {'l','l','e','h'};
        sol.reverseString(s);
        assertArrayEquals(expected, s);
    }
}
