package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample() {
        int[] nums = {-10,-3,0,5,9};
        TreeNode expected = new TreeNode(0,
                new TreeNode(-3, new TreeNode(-10), null),
                new TreeNode(9, new TreeNode(5), null));
        TreeNode actual = sol.sortedArrayToBST(nums);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.left.val, actual.left.val);
        assertEquals(expected.left.left.val, actual.left.left.val);
        assertNull(expected.left.left.left);
        assertNull(expected.left.left.right);
        assertNull(actual.left.right);
        assertEquals(expected.right.val, actual.right.val);
        assertEquals(expected.right.left.val, actual.right.left.val);
        assertNull(expected.right.left.left);
        assertNull(expected.right.left.right);
        assertNull(actual.right.right);
    }

}
