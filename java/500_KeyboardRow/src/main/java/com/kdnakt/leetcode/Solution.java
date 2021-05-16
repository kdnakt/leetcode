package com.kdnakt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of strings words,
 * return the words that can be typed
 * using letters of the alphabet
 * on only one row of American keyboard like the image below.
 * 
 * In the American keyboard:
 * the first row consists of the characters "qwertyuiop",
 * the second row consists of the characters "asdfghjkl", and
 * the third row consists of the characters "zxcvbnm".
 * 
 * Constraints:
 * 1 <= words.length <= 20
 * 1 <= words[i].length <= 100
 * words[i] consists of English letters
 * (both lowercase and uppercase). 
 */
public class Solution {

    char[] firstRow = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
    char[] secondRow = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
    char[] thirdRow = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};

    public String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            String w = word.toLowerCase();
            boolean hasFirst = has(w, firstRow);
            boolean hasSecond = has(w, secondRow);
            boolean hasThird = has(w, thirdRow);
            if (hasFirst && !hasSecond && !hasThird) {
                ans.add(word);
            } else if (!hasFirst && hasSecond && !hasThird) {
                ans.add(word);
            } else if (!hasFirst && !hasSecond && hasThird) {
                ans.add(word);
            }
        }
        String[] res = new String[ans.size()];
        return ans.toArray(res);
    }

    boolean has(String word, char[] row) {
        for (char c : row) {
            if (word.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
}
