package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        List<Integer> expected = Arrays.asList(1,3,3,1);
        assertIterableEquals(expected, sol.getRow(3));
    }

    @Test
    public void testExample2() {
        List<Integer> expected = Arrays.asList(1);
        assertIterableEquals(expected, sol.getRow(0));
    }

    @Test
    public void testExample3() {
        List<Integer> expected = Arrays.asList(1,1);
        assertIterableEquals(expected, sol.getRow(1));
    }

}
