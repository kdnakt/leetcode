package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals("holle", sol.reverseVowels("hello"));
    }

    @Test
    public void testExample2() {
        assertEquals("leotcede", sol.reverseVowels("leetcode"));
    }

    @Test
    public void testExample3() {
        assertEquals("qwerty", sol.reverseVowels("qwerty"));
    }

    @Test
    public void testLong() {
        assertEquals("Marge, let's \"went.\" i awaIt news telegram.",
                sol.reverseVowels("Marge, let's \"went.\" I await news telegram."));
    }
}
