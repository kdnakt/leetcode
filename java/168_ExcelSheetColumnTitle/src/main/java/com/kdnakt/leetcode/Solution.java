package com.kdnakt.leetcode;

/**
 * Given a positive integer,
 * return its corresponding column title
 * as appear in an Excel sheet.
 */
public class Solution {

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        do {
            n -= 1;
            int rem = n % 26;
            sb.insert(0, (char)(rem + 65));
            n /= 26;
        } while (n > 0);
        return sb.toString();
    }

}
