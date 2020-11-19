package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        assertEquals(2, sol.minOperations(logs));
    }

    @Test
    public void testExample2() {
        String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
        assertEquals(3, sol.minOperations(logs));
    }

    @Test
    public void testExample3() {
        String[] logs = {"d1/","../","../","../"};
        assertEquals(0, sol.minOperations(logs));
    }

}
