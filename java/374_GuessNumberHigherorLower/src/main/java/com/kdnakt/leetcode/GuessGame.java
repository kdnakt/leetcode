package com.kdnakt.leetcode;

public class GuessGame {

    int answer;

    int guess(int num) {
        if (num == answer) return 0;
        return num > answer ? -1 : 1;
    }

}
