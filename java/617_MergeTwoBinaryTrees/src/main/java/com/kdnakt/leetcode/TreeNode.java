package com.kdnakt.leetcode;

import java.util.Objects;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TreeNode)) {
            return false;
        }
        TreeNode other = (TreeNode) o;
        if (this.val != other.val) {
            return false;
        }
        return Objects.equals(this.left, other.left)
                && Objects.equals(this.right, other.right);
    }
}