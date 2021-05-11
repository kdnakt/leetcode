package com.kdnakt.leetcode;

import java.util.Arrays;

/**
 * A web developer needs to know how to design
 * a web page's size.
 * So, given a specific rectangular web page’s area,
 * your job by now is to design a rectangular web page,
 * whose length L and width W satisfy
 * the following requirements:
 * 
 * The area of the rectangular web page you designed
 * must equal to the given target area.
 * The width W should not be larger than the length L,
 * which means L >= W.
 * The difference between length L and width W
 * should be as small as possible.
 * Return an array [L, W] where L and W are
 * the length and width of the web page you designed
 * in sequence.
 * 
 * Constraints:
 * 1 <= area <= 10^7
 */
public class Solution {

    public int[] constructRectangle(int area) {
        int candidate = 1;
        for (int i = 2; i <= Math.sqrt(area); i++) {
            if (area % i == 0 && i * i <= area) {
                candidate = i;
            }
        }

        int target = area / candidate;
        int W = Math.min(target, candidate);
        int L = Math.max(target, candidate);
        int[] ans = {L, W};
        return ans;
    }
}
