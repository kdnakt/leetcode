package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        assertEquals(16, sol.islandPerimeter(grid));
    }

    @Test
    public void testExample2() {
        int[][] grid = {{1}};
        assertEquals(4, sol.islandPerimeter(grid));
    }

    @Test
    public void testExample3() {
        int[][] grid = {{1,0}};
        assertEquals(4, sol.islandPerimeter(grid));
    }
}
