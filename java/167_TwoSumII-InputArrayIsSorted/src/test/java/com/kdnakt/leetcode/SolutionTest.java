package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] expected = {1,2};
        assertArrayEquals(expected, sol.twoSum(numbers, target));
    }

    @Test
    public void testExample2() {
        int[] numbers = {2,3,4};
        int target = 6;
        int[] expected = {1,3};
        assertArrayEquals(expected, sol.twoSum(numbers, target));
    }

    @Test
    public void testExample3() {
        int[] numbers = {-1,0};
        int target = -1;
        int[] expected = {1,2};
        assertArrayEquals(expected, sol.twoSum(numbers, target));
    }

}
