package com.kdnakt.leetcode;

/**
 * You are given a string s representing an attendance record
 * for a student where each character signifies
 * whether the student was absent, late, or present
 * on that day.
 * The record only contains the following three characters:
 * 'A': Absent.
 * 'L': Late.
 * 'P': Present.
 * 
 * The student is eligible for an attendance award
 * if they meet both of the following criteria:
 * The student was absent ('A') for strictly fewer than
 * 2 days total.
 * The student was never late ('L') for 3
 * or more consecutive days.
 * 
 * Return true if the student is eligible for
 * an attendance award, or false otherwise.
 * 
 * Constraints:
 * 1 <= s.length <= 1000
 * s[i] is either 'A', 'L', or 'P'.
 */
public class Solution {

    static char A = 'A';
    static String LLL = "LLL";

    public boolean checkRecord(String s) {
        return checkAbsent(s) && checkLate(s);
    }

    boolean checkAbsent(String s) {
        int first = s.indexOf(A);
        if (first < 0) return true;
        int second = s.indexOf(A, first + 1);
        return second < 0;
    }

    boolean checkLate(String s) {
        return !s.contains(LLL);
    }

}
