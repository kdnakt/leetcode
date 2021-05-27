package com.kdnakt.leetcode;

import java.util.Arrays;

/**
 * You are given an integer array score of size n,
 * where score[i] is the score of the ith athlete
 * in a competition. All the scores are guaranteed
 * to be unique.
 * 
 * The athletes are placed based on their scores,
 * where the 1st place athlete has the highest score,
 * the 2nd place athlete has the 2nd highest score,
 * and so on.
 * The placement of each athlete determines their rank:
 * The 1st place athlete's rank is "Gold Medal".
 * The 2nd place athlete's rank is "Silver Medal".
 * The 3rd place athlete's rank is "Bronze Medal".
 * For the 4th place to the nth place athlete,
 * their rank is their placement number
 * (i.e., the xth place athlete's rank is "x").
 * 
 * Return an array answer of size n where answer[i] is
 * the rank of the ith athlete.
 * 
 * Constraints:
 * n == score.length
 * 1 <= n <= 10^4
 * 0 <= score[i] <= 10^6
 * All the values in score are unique.
 */
public class Solution {

    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        int[] copy = score.clone();
        Arrays.sort(score);
        System.out.println(score[0]);
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (score[i] == copy[j]) {
                    ans[j] = find(score.length - i);
                    break;
                }
            }
        }
        return ans;
    }

    String find(int i) {
        switch (i) {
            case 1:
                return "Gold Medal";
            case 2:
                return "Silver Medal";
            case 3:
                return "Bronze Medal";
            default:
                return String.valueOf(i);
        }
    }
}
