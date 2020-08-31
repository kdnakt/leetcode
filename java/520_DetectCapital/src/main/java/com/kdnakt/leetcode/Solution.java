package com.kdnakt.leetcode;

public class Solution {

    public boolean detectCapitalUse(String word) {
        if (word == null) return false;
        boolean isFirstLetterCapital = false;
        boolean hasMoreThanOneCapital = false;
        boolean isFirst = true;
        boolean hasCapitalLetter = false;
        boolean hasNotCapitalLetter = false;
        for (char c : word.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                hasCapitalLetter = true;
                if (isFirst) {
                    isFirstLetterCapital = true;
                } else {
                    hasMoreThanOneCapital = true;
                }
                if (!isFirst && hasNotCapitalLetter) {
                    return false;
                }
                if (hasNotCapitalLetter) {
                    return false;
                }
            } else {
                hasNotCapitalLetter = true;
                if (hasMoreThanOneCapital) {
                    return false;
                }
            }
            isFirst = false;
        }
        if (!hasCapitalLetter) {
            return true;
        }
        if (!hasNotCapitalLetter) {
            return true;
        }
        return true;
    }

}
