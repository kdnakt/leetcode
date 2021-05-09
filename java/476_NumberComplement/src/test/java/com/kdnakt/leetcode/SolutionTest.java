package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    /**
     * Explanation: The binary representation of 5 is 101
     * (no leading zero bits),
     * and its complement is 010. So you need to output 2.
     */
    @Test
    public void testExample1() {
        int num = 5;
        assertEquals(2, sol.findComplement(num));
    }

    /**
     * Explanation: The binary representation of 1 is 1
     * (no leading zero bits),
     * and its complement is 0. So you need to output 0.
     */
    @Test
    public void testExample2() {
        int num = 1;
        assertEquals(0, sol.findComplement(num));
    }

}
