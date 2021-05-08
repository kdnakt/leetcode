package com.kdnakt.leetcode;

/**
 * You are given row x col grid representing a map
 * where grid[i][j] = 1 represents land
 * and grid[i][j] = 0 represents water.
 * 
 * Grid cells are connected horizontally/vertically
 * (not diagonally). The grid is completely surrounded
 * by water, and there is exactly one island
 * (i.e., one or more connected land cells).
 * 
 * The island doesn't have "lakes",
 * meaning the water inside isn't connected
 * to the water around the island.
 * One cell is a square with side length 1.
 * The grid is rectangular, width and height
 * don't exceed 100.
 * Determine the perimeter of the island.
 * 
 * Constraints:
 * row == grid.length
 * col == grid[i].length
 * 1 <= row, col <= 100
 * grid[i][j] is 0 or 1.
 */
public class Solution {

    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 1) {
                    ans += 4;
                    int right = j + 1;
                    if (right < row.length && row[right] == 1) {
                        ans -= 2;
                    }
                    int down = i + 1;
                    if (down < grid.length && grid[down][j] == 1) {
                        ans -= 2;
                    }
                }
            }
        }
        return ans;
    }

}
