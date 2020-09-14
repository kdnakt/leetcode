package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        String s = "Hello World";
        assertEquals(5, sol.lengthOfLastWord(s));
    }

    @Test
    public void testSpace() {
        assertEquals(0, sol.lengthOfLastWord(" "));
    }

    @Test
    public void testLastWordNotExist() {
        assertEquals(0, sol.lengthOfLastWord(""));
    }

    @Test
    public void testLastWordWithSpace() {
        assertEquals(1, sol.lengthOfLastWord("a b c "));
    }

}
