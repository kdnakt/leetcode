struct Solution;
impl Solution {
    pub fn is_monotonic(nums: Vec<i32>) -> bool {
        false
    }
}

fn main() {
    // Example 1
    let nums = vec![1,2,2,3];
    assert_eq!(Solution::is_monotonic(nums), true);

    // Example 2
    let nums = vec![6,5,4,4];
    assert_eq!(Solution::is_monotonic(nums), true);

    // Example 3
    let nums = vec![1,3,2];
    assert_eq!(Solution::is_monotonic(nums), false);
}