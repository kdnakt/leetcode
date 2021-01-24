package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        sol.answer = 6;
        assertEquals(sol.answer, sol.guessNumber(10));
    }

    @Test
    public void testExample2() {
        sol.answer = 1;
        assertEquals(sol.answer, sol.guessNumber(1));
    }

    @Test
    public void testExample3() {
        sol.answer = 1;
        assertEquals(sol.answer, sol.guessNumber(2));
    }

    @Test
    public void testExample4() {
        sol.answer = 2;
        assertEquals(sol.answer, sol.guessNumber(2));
    }

    @Test
    public void testIntOverflow() {
        sol.answer = 1702766719;
        assertEquals(sol.answer, sol.guessNumber(2126753390));
    }
}
