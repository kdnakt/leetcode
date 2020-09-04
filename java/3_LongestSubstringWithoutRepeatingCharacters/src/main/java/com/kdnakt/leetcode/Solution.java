package com.kdnakt.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int possibleMax = s.chars().distinct().toArray().length;
        return findLongest(s, s.length() - 1, possibleMax);
    }

    int findLongest(String s, int curr, int possibleMax) {
        if (0 == curr) {
            return find(s);
        }
        if ((s.length() - curr - 1) > possibleMax) {
            return find(s.substring(curr));
        }
        return Math.max(
            find(s.substring(curr)),
            findLongest(s, curr - 1, possibleMax));
    }

    int find(String s) {
        Set<Character> used = new HashSet<>();
        int longest = 0;
        int tmp = 0;
        for (char c : s.toCharArray()) {
            if (used.contains(Character.valueOf(c))) {
                if (tmp >= longest) longest = tmp;
                tmp = 1;
                used.clear();
                used.add(Character.valueOf(c));
                continue;
            }
            tmp++;
            used.add(Character.valueOf(c));
        }
        return tmp > longest ? tmp : longest;
    }

}
