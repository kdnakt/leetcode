package com.kdnakt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Note:
 * Each element in the result should appear
 * as many times as it shows in both arrays.
 * The result can be in any order.
 */
public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) list1.add(nums1[i]);
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) list2.add(nums2[i]);

        List<Integer> temp = list1.size() < list2.size() ?
                solve(list1, list2) : solve(list2, list1);
        int[] res = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) res[i] = temp.get(i).intValue();
        return res;
    }

    List<Integer> solve(List<Integer> l1, List<Integer> l2) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : l1) {
            if (l2.contains(i)) {
                res.add(i);
                l2.remove(i);
            }
        }
        return res;
    }

}
