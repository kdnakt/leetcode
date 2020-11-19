package com.kdnakt.leetcode;

/**
 * Constraints:
 * 1 <= logs.length <= 10^3
 * 2 <= logs[i].length <= 10
 * logs[i] contains lowercase English letters, digits, '.', and '/'.
 * logs[i] follows the format described in the statement.
 * Folder names consist of lowercase English letters and digits.
 */
public class Solution {

    static String GOTO_PARENT = "../";
    static String GOTO_CURRENT = "./";

    public int minOperations(String[] logs) {
        int minOps = 0;
        for (String log : logs) {
            if (GOTO_CURRENT.equals(log)) {
                // do nothing
            } else if (GOTO_PARENT.equals(log)) {
                if (minOps > 0) minOps--;
            } else {
                minOps++;
            }
        }
        return minOps;
    }

}
