package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int n = 1;
        List<String> expected = Arrays.asList("1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32");
        Collections.sort(expected);
        List<String> actual = sol.readBinaryWatch(n);
        Collections.sort(actual);
        assertIterableEquals(expected, actual);
    }

    @Test
    public void testExample2() {
        int n = 0;
        List<String> expected = Arrays.asList("0:00");
        Collections.sort(expected);
        List<String> actual = sol.readBinaryWatch(n);
        Collections.sort(actual);
        assertIterableEquals(expected, actual);
    }

}
