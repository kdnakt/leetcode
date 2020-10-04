package com.kdnakt.leetcode;

class MinStack {

    int[] nums;
    int curr = -1;
    int min;

    /** initialize your data structure here. */
    public MinStack() {
        nums = new int[1000000];
        curr = -1;
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        nums[++curr] = x;
        min = Math.min(x, min);
    }
    
    public void pop() {
        curr--;
        min = Integer.MAX_VALUE;
        for (int i = 0; i <= curr; i++) {
            min = Math.min(min, nums[i]);
        }
    }
    
    public int top() {
        return nums[curr];
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */