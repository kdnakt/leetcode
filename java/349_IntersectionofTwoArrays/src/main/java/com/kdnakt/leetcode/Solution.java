package com.kdnakt.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given two arrays, write a function
 * to compute their intersection.
 * 
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> temp = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) temp.add(nums1[i]);
            }
        }
        int[] res = new int[temp.size()];
        int count = 0;
        for (Integer i : temp) {
            res[count++] = i.intValue();
        }
        return res;
    }

}
