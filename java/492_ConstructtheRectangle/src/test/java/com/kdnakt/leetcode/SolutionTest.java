package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int area = 4;
        int[] expected = {2,2};
        assertArrayEquals(expected, sol.constructRectangle(area));
    }

    @Test
    public void testExample2() {
        int area = 37;
        int[] expected = {37,1};
        assertArrayEquals(expected, sol.constructRectangle(area));
    }

    @Test
    public void testExample3() {
        int area = 122122;
        int[] expected = {427,286};
        assertArrayEquals(expected, sol.constructRectangle(area));
    }

    @Test
    public void testExample4() {
        int area = 16;
        int[] expected = {4,4};
        assertArrayEquals(expected, sol.constructRectangle(area));
    }

    @Test
    public void testExample5() {
        int area = 10000000;
        int[] expected = {3200,3125};
        assertArrayEquals(expected, sol.constructRectangle(area));
    }
}
