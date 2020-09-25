package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1,1));
        expected.add(Arrays.asList(1,2,1));
        expected.add(Arrays.asList(1,3,3,1));
        expected.add(Arrays.asList(1,4,6,4,1));
        assertIterableEquals(expected, sol.generate(5));
    }

}
