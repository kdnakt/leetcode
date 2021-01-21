package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] actual = sol.intersection(nums1, nums2);
        Arrays.sort(actual);
        int[] expected = {2};
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testExample2() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] actual = sol.intersection(nums1, nums2);
        Arrays.sort(actual);
        int[] expected = {9,4};
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
    }

}
