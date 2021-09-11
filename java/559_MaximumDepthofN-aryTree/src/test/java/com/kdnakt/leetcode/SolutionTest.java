package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        Node root = new Node(1);
        root.children = new ArrayList<Node>();
        Node child3 = new Node(3);
        root.children.add(child3);
        root.children.add(new Node(2));
        root.children.add(new Node(4));
        child3.children = new ArrayList<Node>();
        child3.children.add(new Node(5));
        child3.children.add(new Node(6));
        assertEquals(3, sol.maxDepth(root));
    }

    @Test
    public void testExample2() {
        Node root = new Node(1);
        root.children = new ArrayList<Node>();
        Node child3 = new Node(3);
        root.children.add(child3);
        root.children.add(new Node(2));
        root.children.add(new Node(4));
        child3.children = new ArrayList<Node>();
        Node child5 = new Node(5);
        child3.children.add(child5);
        child3.children.add(new Node(6));
        child5.children = new ArrayList<Node>();
        child5.children.add(new Node(7));
        assertEquals(4, sol.maxDepth(root));
    }
}
