struct Solution;
use std::cmp::min;
impl Solution {
    pub fn min_cost_climbing_stairs(cost: Vec<i32>) -> i32 {
        let len = cost.len();
        let mut dp: Vec<i32> = Vec::new();
        dp.push(cost[0]);
        dp.push(cost[1]);
        for i in 2..len {
            dp.push(min(dp[i - 1], dp[i - 2]) + cost[i]);
        }
        min(dp[len - 1], dp[len - 2])
    }
}

fn main() {
    // Example 1
    let cost = vec![10,15,20];
    assert_eq!(Solution::min_cost_climbing_stairs(cost), 15);

    // Example 2
    let cost = vec![1,100,1,1,1,100,1,1,100,1];
    assert_eq!(Solution::min_cost_climbing_stairs(cost), 6);
}