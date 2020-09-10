package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1Return() {
        int[] nums = {1,1,2};
        assertEquals(2, sol.removeDuplicates(nums));
    }

    @Test
    public void testExample1Array() {
        int[] nums = {1,1,2};
        int len = sol.removeDuplicates(nums);
        int[] expected = {1,2};
        for (int i = 0; i < len; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void testExample2Return() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, sol.removeDuplicates(nums));
    }

    @Test
    public void testExample2Array() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int len = sol.removeDuplicates(nums);
        int[] expected = {0,1,2,3,4};
        for (int i = 0; i < len; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void testNoDuplicatesReturn() {
        int[] nums = {0,2,4,6,8};
        assertEquals(5, sol.removeDuplicates(nums));
    }

    @Test
    public void testNoDuplicatesArray() {
        int[] nums = {0,2,4,6,8};
        int len = sol.removeDuplicates(nums);
        int[] expected = {0,2,4,6,8};
        for (int i = 0; i < len; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }


    @Test
    public void testOneElementReturn() {
        int[] nums = {3};
        assertEquals(1, sol.removeDuplicates(nums));
    }

    @Test
    public void testOneElementArray() {
        int[] nums = {3};
        int len = sol.removeDuplicates(nums);
        int[] expected = {3};
        for (int i = 0; i < len; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void testEmptyReturn() {
        int[] nums = {};
        assertEquals(0, sol.removeDuplicates(nums));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int len = sol.removeDuplicates(nums);
        int[] expected = {};
        for (int i = 0; i < len; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

}
