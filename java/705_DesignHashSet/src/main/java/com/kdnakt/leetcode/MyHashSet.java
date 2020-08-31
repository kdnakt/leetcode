package com.kdnakt.leetcode;

public class MyHashSet {

    int[] data;

    /** Initialize your data structure here. */
    public MyHashSet() {
        data = new int[1000001];
    }
    
    public void add(int key) {
        data[key]++;
    }
    
    public void remove(int key) {
        data[key] = 0;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return data[key] > 0;
    }

}