package com.kdnakt.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a pattern and a string s,
 * find if s follows the same pattern.
 * 
 * Here follow means a full match,
 * such that there is a bijection
 * between a letter in pattern
 * and a non-empty word in s.
 * 
 * Constraints:
 * 1 <= pattern.length <= 300
 * pattern contains only lower-case English letters.
 * 1 <= s.length <= 3000
 * s contains only lower-case English letters and spaces ' '.
 * s does not contain any leading or trailing spaces.
 * All the words in s are separated by a single space.
 */
public class Solution {

    private static final String WS = " ";
    public boolean wordPattern(String pattern, String s) {
        char[] parr = pattern.toCharArray();
        String[] sarr = s.split(WS);
        if (parr.length != sarr.length) return false;
        Map<Character, String> map = new HashMap<>(26);
        Set<String> set = new HashSet<>(26);
        for (int i = 0; i < parr.length; i++) {
            char key = parr[i];
            if (map.containsKey(key)) {
                if (!map.get(key).equals(sarr[i])) {
                    return false;
                }
            } else if (!set.add(sarr[i])) {
                return false;
            } else {
                map.put(key, sarr[i]);
            }
        }
        return true;
    }

}
