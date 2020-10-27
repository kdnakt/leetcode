package com.kdnakt.leetcode;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        int[] ctMap = new int[1000];
        int[] csMap = new int[1000];
        for (int i = 0; i < ctMap.length; i++) {
            csMap[i] = -1;
            ctMap[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i), ct = t.charAt(i);
            if (ctMap[ct] == -1) ctMap[ct] = cs;
            if (csMap[cs] == -1) csMap[cs] = ct;
            if (ctMap[ct] != cs) return false;
            if (csMap[cs] != ct) return false;
        }
        return true;
    }
}
