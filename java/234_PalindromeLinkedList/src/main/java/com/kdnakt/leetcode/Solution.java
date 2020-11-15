package com.kdnakt.leetcode;

import java.util.ArrayList;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(head.val));
        while (head.next != null) {
            head = head.next;
            list.add(Integer.valueOf(head.val));
        }
        int len = list.size();
        for (int i = 0; i < len; i++) {
            if (!list.get(i).equals(list.get(len - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
