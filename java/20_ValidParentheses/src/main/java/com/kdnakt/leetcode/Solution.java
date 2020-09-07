package com.kdnakt.leetcode;

import java.util.Stack;
/**
 * Given a string s containing just the characters
 *  '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 *  Open brackets must be closed by the same type of brackets.
 *  Open brackets must be closed in the correct order.
 * 
 * Constraints:
 * 1 <= s.length <= 10^4
 * s consists of parentheses only '()[]{}'.
 */
public class Solution {

    public boolean isValid(String s) {
        if (s.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (isOpen(c)) {
                stack.push(Character.valueOf(c));
            } else {
                if (stack.empty()) return false;
                char open = stack.pop();
                if (open != findPair(c)) return false;
            }
        }
        return stack.empty();
    }

    char findPair(char c) {
        switch (c) {
            case '}':
                return '{';
            case ')':
                return '(';
            case ']':
                return '[';
            default:
                throw new RuntimeException("invalid char: " + c);
        }
    }

    boolean isOpen(char c) {
        return c == '{' || c == '(' || c == '[';
    }

}
