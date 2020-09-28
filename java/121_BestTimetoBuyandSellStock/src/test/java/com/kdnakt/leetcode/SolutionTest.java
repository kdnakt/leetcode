package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {7,1,5,3,6,4};
        assertEquals(5, sol.maxProfit(nums));
    }

    
    @Test
    public void testExample2() {
        int[] nums = {7,6,4,3,1};
        assertEquals(0, sol.maxProfit(nums));
    }

}
