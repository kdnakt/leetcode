package com.kdnakt.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(Integer.valueOf(1));
        if (rowIndex == 0) return res;
        res.add(Integer.valueOf(1));
        if (rowIndex == 1) return res;
        for (int i = 0; i < rowIndex - 1; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(Integer.valueOf(1));
            for (int j = 0; j < res.size() - 1; j++) {
                tmp.add(j+1, Integer.valueOf(
                        res.get(j) + res.get(j+1)));
            }
            tmp.add(Integer.valueOf(1));
            res = tmp;
        }
        return res;
    }
}
