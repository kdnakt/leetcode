package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyHashSetTest {

    @Test
    public void testContainsAddedNumber() {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        assertTrue(hashSet.contains(1));
    }

    @Test
    public void testNotContains() {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        assertFalse(hashSet.contains(3));
    }

    @Test
    public void testRemove() {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(2); 
        assertTrue(hashSet.contains(2));
        hashSet.remove(2);
        assertFalse(hashSet.contains(2));
    }

}
