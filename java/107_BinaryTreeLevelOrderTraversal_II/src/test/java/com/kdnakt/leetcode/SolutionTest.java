package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testIsTrue() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(15, 7));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(3));
        assertIterableEquals(expected, sol.levelOrderBottom(root));
    }

    @Test
    public void testNullToEmptyList() {
        assertTrue(sol.levelOrderBottom(null).isEmpty());
    }

    @Test
    public void testFailed1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3));
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(4, 5));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(1));
        assertIterableEquals(expected, sol.levelOrderBottom(root));
    }
}
