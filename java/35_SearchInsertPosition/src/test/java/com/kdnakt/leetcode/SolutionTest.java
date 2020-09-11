package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {1,3,5,6};
        assertEquals(2, sol.searchInsert(nums, 5));
    }

    @Test
    public void testExample2() {
        int[] nums = {1,3,5,6};
        assertEquals(1, sol.searchInsert(nums, 2));
    }

    @Test
    public void testExample3() {
        int[] nums = {1,3,5,6};
        assertEquals(4, sol.searchInsert(nums, 7));
    }

    @Test
    public void testExample4() {
        int[] nums = {1,3,5,6};
        assertEquals(0, sol.searchInsert(nums, 0));
    }

    @Test
    public void testLength1() {
        int[] nums = {1};
        assertEquals(0, sol.searchInsert(nums, 1));
    }

}
