package com.kdnakt.leetcode;


/**
 * The count-and-say sequence is the sequence of integers
 * with the first five terms as following:
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * 
 * Given an integer n where 1 ≤ n ≤ 30,
 * generate the nth term of the count-and-say sequence.
 * You can do so recursively, in other words from the previous member
 * read off the digits, counting the number of digits
 * in groups of the same digit. 
 */
public class Solution {

    public String countAndSay(int n) {
        if (n == 1) return "1";
        if (n == 2) return "11";
        String res = countAndSay(n - 1);
        char prev = '0';
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : res.toCharArray()) {
            if (prev != c && count > 0) {
                sb.append(count).append(prev);
                count = 1;
            } else {
                count++;
            }
            prev = c;
        }
        sb.append(count).append(prev);
        return sb.toString();
    }

}
