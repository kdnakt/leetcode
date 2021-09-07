package com.kdnakt.leetcode;

/**
 * Given a string s, reverse the order of characters
 * in each word within a sentence
 * while still preserving whitespace and initial word order.
 * 
 * Constraints:
 * 1 <= s.length <= 5 * 10^4
 * s contains printable ASCII characters.
 * s does not contain any leading or trailing spaces.
 * There is at least one word in s.
 * All the words in s are separated by a single space.
 */
public class Solution {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        int last = words.length - 1;
        for (int i = 0; i < words.length; i++) {
            char[] arr = words[i].toCharArray();
            for (int j = arr.length - 1; j >= 0; j--) {
                res.append(arr[j]);
            }
            if (i != last) {
                res.append(' ');
            }
        }
        return res.toString();
    }

}
