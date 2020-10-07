package com.kdnakt.leetcode;

import java.util.Map;
import java.util.HashMap;
/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than
 * ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty
 * and the majority element always exist in the array.
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums[0];
        int majCount = 0;
        int threshold = nums.length / 2;
        //int[] arr = new int[1000000];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int t = nums[i];
            if (!map.containsKey(t)) map.put(t, Integer.valueOf(0));
            int c = map.get(t) + 1;
            if (threshold < c) return t;
            map.put(t, c);
            if (majCount < c) {
                majCount = c;
                maj = t;
            }
        }
        return maj;
    }
}
