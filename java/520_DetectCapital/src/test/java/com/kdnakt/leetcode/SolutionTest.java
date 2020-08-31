package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testAllLettersAreCapitals() {
        assertTrue(sol.detectCapitalUse("USA"));
    }

    @Test
    public void testAllLettersAreNotCapitals() {
        assertTrue(sol.detectCapitalUse("leetcode"));
    }

    @Test
    public void testOnlyFirstLetterIsCapital() {
        assertTrue(sol.detectCapitalUse("Google"));
    }

    @Test
    public void testExample2() {
        assertFalse(sol.detectCapitalUse("FlaG"));
    }

    @Test
    public void testOnlyLastLetterIsNotCapital() {
        assertFalse(sol.detectCapitalUse("FFFf"));
    }
}
