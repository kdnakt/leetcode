package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void test0() {
        assertEquals(0, sol.arrangeCoins(0));
    }

    @Test
    public void test1() {
        assertEquals(1, sol.arrangeCoins(1));
    }

    @Test
    public void test2() {
        assertEquals(1, sol.arrangeCoins(2));
    }

    @Test
    public void test3() {
        assertEquals(2, sol.arrangeCoins(3));
    }

    @Test
    public void test4() {
        assertEquals(2, sol.arrangeCoins(4));
    }

    @Test
    public void test5() {
        assertEquals(2, sol.arrangeCoins(5));
    }

    @Test
    public void test6() {
        assertEquals(3, sol.arrangeCoins(6));
    }

    @Test
    public void testLarge() {
        assertEquals(60070, sol.arrangeCoins(1804289383));
    }

}
