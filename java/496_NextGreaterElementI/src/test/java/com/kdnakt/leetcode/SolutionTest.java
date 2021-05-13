package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] nums1 = {4,1,2}, nums2 = {1,3,4,2};
        int[] expected = {-1,3,-1};
        assertArrayEquals(expected, sol.nextGreaterElement(nums1, nums2));
    }

    @Test
    public void testExample2() {
        int[] nums1 = {2,4}, nums2 = {1,2,3,4};
        int[] expected = {3,-1};
        assertArrayEquals(expected, sol.nextGreaterElement(nums1, nums2));
    }

}
