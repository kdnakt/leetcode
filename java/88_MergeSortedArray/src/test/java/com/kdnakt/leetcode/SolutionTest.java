package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] expected = {1,2,2,3,5,6};
        sol.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testEveryNums1IsGreater() {
        int[] nums1 = {100,200,300,400,0,0,0};
        int m = 4;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] expected = {2,5,6,100,200,300,400};
        sol.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }
}
