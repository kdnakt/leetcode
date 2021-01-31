package com.kdnakt.leetcode;

/**
 * Given an integer, write an algorithm to convert it
 * to hexadecimal. For negative integer,
 * two’s complement method is used.
 * 
 * Note:
 * All letters in hexadecimal (a-f) must be in lowercase.
 * The hexadecimal string must not contain extra leading 0s.
 * If the number is zero, it is represented
 * by a single zero character '0'; otherwise, the first character
 * in the hexadecimal string will not be the zero character.
 * The given number is guaranteed to fit within the range
 * of a 32-bit signed integer.
 * You must not use any method provided by the library
 * which converts/formats the number to hex directly.
 */
public class Solution {

    public String toHex(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        boolean isMinus = false;
        if (num < 0) {
            num += Integer.MAX_VALUE + 1;
            isMinus = true;
        }
        if (num == 0) return "80000000";
        char lastChar = 0;
        while (num > 0) {
            int r = num % 16;
            lastChar = convert(r);
            sb.insert(0, lastChar);
            num -= r;
            num /= 16;
        }
        if (isMinus) {
            sb.replace(0, 1,
                String.valueOf(convert(sb.charAt(0) - 40)));
        }
        return sb.toString();
    }

    char convert(int num) {
        switch (num) {
            case 10:
                return 'a';
            case 11:
                return 'b';
            case 12:
                return 'c';
            case 13:
                return 'd';
            case 14:
                return 'e';
            case 15:
                return 'f';
            default:
                return String.valueOf(num).charAt(0);
        }
    }

}
