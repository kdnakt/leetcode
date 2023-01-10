struct Solution;
impl Solution {
    pub fn min_cost_climbing_stairs(cost: Vec<i32>) -> i32 {
        0
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