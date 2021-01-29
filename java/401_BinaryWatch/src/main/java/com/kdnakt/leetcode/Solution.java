package com.kdnakt.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A binary watch has 4 LEDs on the top
 * which represent the hours (0-11),
 * and the 6 LEDs on the bottom represent the minutes (0-59).
 * 
 * Each LED represents a zero or one,
 * with the least significant bit on the right.
 * 
 * Given a non-negative integer n which represents the number
 * of LEDs that are currently on,
 * return all possible times the watch could represent.
 * 
 * Note:
 * The order of output does not matter.
 * The hour must not contain a leading zero,
 * for example "01:00" is not valid, it should be "1:00".
 * The minute must be consist of two digits
 * and may contain a leading zero,
 * for example "10:2" is not valid, it should be "10:02".
 */
public class Solution {

    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();
        for (int h = (num >= 6 ? num - 5 : 0) ; h <= Math.min(3, num); h++) {
            int m = num - h;
            for (String hour : solveHour(h)) {
                for (String min : solveMin(m)) {
                    result.add(hour + min);
                }
            }
        }
        return result;
    }

    List<String> solveHour(int h) {
        switch (h) {
            case 0:
                return Arrays.asList("0:");
            case 1:
                return Arrays.asList("1:", "2:", "4:", "8:");
            case 2:
                return Arrays.asList("3:", "5:", "9:", "6:", "10:");
            case 3:
            default:
                return Arrays.asList("7:", "11:");
        }
    }

    List<String> solveMin(int m) {
        switch (m) {
            case 0:
                return Arrays.asList("00");
            case 1:
                return Arrays.asList("01", "02", "04", "08", "16", "32");
            case 2:
                return Arrays.asList("03", "05", "09", "17", "33",
                        "06", "10", "18", "34",
                        "12", "20", "36",
                        "24", "40",
                        "48");
            case 3:
                return Arrays.asList("07", "11", "19", "35",
                        "13", "21", "37",
                        "25", "41",
                        "49",
                        "14", "22", "38",
                        "26", "42",
                        "50",
                        "28", "44",
                        "52",
                        "56");
            case 4:
                return Arrays.asList("15", "23", "39",
                        "27", "43",
                        "57",
                        "30", "46", "54", "58",
                        "29", "45",
                        "51", "53");
            case 5:
            default:
                return Arrays.asList("31", "47", "55", "59");
        }
    } 
}
