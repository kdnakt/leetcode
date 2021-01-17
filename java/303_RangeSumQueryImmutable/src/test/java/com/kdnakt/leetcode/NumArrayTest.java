package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumArrayTest {

    @Test
    public void testExample1_1() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        // return 1 ((-2) + 0 + 3)
        assertEquals(1, numArray.sumRange(0, 2));
    }

    @Test
    public void testExample1_2() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        // return -1 (3 + (-5) + 2 + (-1)) 
        assertEquals(-1, numArray.sumRange(2, 5));
    }

    @Test
    public void testExample1_3() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
        assertEquals(-3, numArray.sumRange(0, 5));
    }

}
