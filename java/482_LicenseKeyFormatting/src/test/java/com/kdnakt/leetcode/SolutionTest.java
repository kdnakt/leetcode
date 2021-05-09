package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    /**
     * Explanation: The string s has been split into two parts,
     * each part has 4 characters.
     * Note that the two extra dashes are not needed
     * and can be removed.
     */
    @Test
    public void testExample1() {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        assertEquals("5F3Z-2E9W", sol.licenseKeyFormatting(s, k));
    }

    /**
     * Explanation: The string s has been split into
     * three parts, each part has 2 characters
     * except the first part
     * as it could be shorter as mentioned above.
     */
    @Test
    public void testExample2() {
        String s = "2-5g-3-J";
        int k = 2;
        assertEquals("2-5G-3J", sol.licenseKeyFormatting(s, k));
    }

    @Test
    public void testExample3() {
        String s = "2J-";
        int k = 2;
        assertEquals("2J", sol.licenseKeyFormatting(s, k));
    }

    @Test
    public void testExample4() {
        String s = "2-4A0r7-4k";
        int k = 4;
        assertEquals("24A0-R74K", sol.licenseKeyFormatting(s, k));
    }

    @Test
    public void testExample5() {
        String s = "2-4A0r7-4k";
        int k = 3;
        assertEquals("24-A0R-74K", sol.licenseKeyFormatting(s, k));
    }
}
