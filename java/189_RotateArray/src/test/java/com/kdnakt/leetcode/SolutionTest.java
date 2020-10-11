package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] expected = {5,6,7,1,2,3,4};
        sol.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testExample2() {
        int[] nums = {-1,-100,3,99};
        int k = 2;
        int[] expected = {3,99,-1,-100};
        sol.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

}
