package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1Return() {
        int[] nums = {3,2,2,3};
        assertEquals(2, sol.removeElement(nums, 3));
    }

    @Test
    public void testExample1Array() {
        int[] nums = {3,2,2,3};
        int len = sol.removeElement(nums, 3);
        int[] expected = {2,2};
        for (int i = 0; i < len; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void testExample2Return() {
        int[] nums = {0,1,2,2,3,0,4,2};
        assertEquals(5, sol.removeElement(nums, 2));
    }

    @Test
    public void testExample2Array() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int len = sol.removeElement(nums, 2);
        int[] expected = {0,1,3,0,4};
        for (int i = 0; i < len; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void testLength1MatchesReturn() {
        int[] nums = {4};
        assertEquals(0, sol.removeElement(nums, 4));
    }

    @Test
    public void testLength1MatchesArray() {
        int[] nums = {4};
        int len = sol.removeElement(nums, 4);
        int[] expected = {};
        for (int i = 0; i < len; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void testLength1NotMatchesReturn() {
        int[] nums = {4};
        assertEquals(1, sol.removeElement(nums, 3));
    }

    @Test
    public void testLength1NotMatchesArray() {
        int[] nums = {4};
        int len = sol.removeElement(nums, 3);
        int[] expected = {4};
        for (int i = 0; i < len; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }
}
