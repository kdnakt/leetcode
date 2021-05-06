package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    /**
     * 1   (0 0 0 1)
     * 4   (0 1 0 0)
     *        ↑   ↑
     * The above arrows point to positions
     * where the corresponding bits are different.
     */
    @Test
    public void testExample1() {
        int x = 1, y = 4;
        assertEquals(2, sol.hammingDistance(x, y));
    }

    @Test
    public void testExample2() {
        int x = 3, y = 1;
        assertEquals(1, sol.hammingDistance(x, y));
    }

    @Test
    public void testExample3() {
        int x = 0, y = 0;
        assertEquals(0, sol.hammingDistance(x, y));
    }

    @Test
    public void testExample4() {
        int x = 1, y = 0;
        assertEquals(1, sol.hammingDistance(x, y));
    }

}
