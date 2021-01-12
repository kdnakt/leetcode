package com.kdnakt.leetcode;

public class VersionControl {

    public static int firstBadVersion = -1;
    boolean isBadVersion(int version) {
        return version >= firstBadVersion;
    }

}
