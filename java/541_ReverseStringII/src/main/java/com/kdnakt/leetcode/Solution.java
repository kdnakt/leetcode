package com.kdnakt.leetcode;

/**
 * Given a string s and an integer k,
 * reverse the first k characters 
 * or every 2k characters counting
 * from the start of the string.
 * 
 * If there are fewer than k characters left,
 * reverse all of them.
 * If there are less than 2k but greater than
 * or equal to k characters,
 * then reverse the first k characters
 * and left the other as original.
 * 
 * Constraints:
 * 1 <= s.length <= 10^4
 * s consists of only lowercase English letters.
 * 1 <= k <= 10^4
 */
class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2 * k) {
            for (int j = i + k - 1; i <= j; j--) {
                if (arr.length <= j) continue;
                sb.append(arr[j]);
            }
            for (int j = i + k; j < i + 2 * k; j++) {
                if (arr.length <= j) continue;
                sb.append(arr[j]);
            }
        }
        return sb.toString();
    }
}