package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void test1() {
        assertEquals("1", sol.countAndSay(1));
    }

    @Test
    public void test2() {
        assertEquals("11", sol.countAndSay(2));
    }

    @Test
    public void test3() {
        assertEquals("21", sol.countAndSay(3));
    }

    /**
     * For n = 3 the term was "21" in which we have two groups "2" and "1",
     * "2" can be read as "12" which means frequency = 1 and value = 2,
     * the same way "1" is read as "11",
     * so the answer is the concatenation of "12" and "11" which is "1211".
     */
    @Test
    public void test4() {
        assertEquals("1211", sol.countAndSay(4));
    }

    @Test
    public void test5() {
        assertEquals("111221", sol.countAndSay(5));
    }

}
