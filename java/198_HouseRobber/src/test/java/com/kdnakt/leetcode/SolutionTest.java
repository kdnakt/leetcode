package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {1,2,3,1};
        assertEquals(4, sol.rob(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {2,7,9,3,1};
        assertEquals(12, sol.rob(nums));
    } 

}
