package com.kdnakt.leetcode;

/**
 * Given two non-negative integers num1 and num2
 * represented as string, return the sum of num1 and num2.
 * 
 * Note:
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library
 * or convert the inputs to integer directly.
 */
public class Solution {

    public String addStrings(String num1, String num2) {
        if (num1.length() < num2.length()) {
            String tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        // num2 <= num1
        StringBuilder sb = new StringBuilder();
        boolean up = false;
        for (int i = 0; i < num1.length(); i++) {
            char c2 = num2.length() - i > 0 ? num2.charAt(num2.length() - i - 1) : '0';
            char c1 = num1.length() - i > 0 ? num1.charAt(num1.length() - i - 1) : '0';
            char[] result = addDigit(c1, c2, up);
            up = result.length == 2;
            sb.insert(0, result[0]);
            if (up && i == num1.length() - 1) sb.insert(0, '1');
        }
        return sb.toString();
    }

    char[] addDigit(char c1, char c2, boolean up) {
        int i1 = c1 - 48;
        int i2 = c2 - 48;
        int ans = i1 + i2 + (up ? 1 : 0);
        if (ans > 9) {
            char[] res = {convert(ans-10), 1};
            return res;
        }
        char[] res = {convert(ans)};
        return res;
    }

    char convert(int i) {
        switch (i) {
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            case 9:
                return '9';
            default:
                return '0';
        }
    }
}
