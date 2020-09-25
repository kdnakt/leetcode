package com.kdnakt.leetcode;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;
        result.add(Arrays.asList(1));
        if (numRows == 1) return result;
        result.add(Arrays.asList(1, 1));
        if (numRows == 2) return result;
        for (int i = 2; i < numRows; i++) {
            List<Integer> prev = result.get(i-1);
            List<Integer> tmp = new ArrayList<>();
            tmp.add(Integer.valueOf(1));
            for (int j = 0; j < prev.size() - 1; j++) {
                tmp.add(Integer.valueOf(
                        prev.get(j) + prev.get(j+1)));
            }
            tmp.add(Integer.valueOf(1));
            result.add(tmp);
        }
        return result;
    }

}
