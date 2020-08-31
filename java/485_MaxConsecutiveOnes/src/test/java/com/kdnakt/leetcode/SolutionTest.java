package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int[] input  = {1,1,0,1,1,1};
        assertEquals(3, sol.findMaxConsecutiveOnes(input));
    }

}
