struct Solution;
impl Solution {
    pub fn pivot_index(nums: Vec<i32>) -> i32 {
        0
    }
}

fn main() {
    // Example 1
    let nums = vec![1,7,3,6,5,6];
    assert_eq!(Solution::pivot_index(nums), 3);

    // Example 2
    let nums = vec![1,2,3];
    assert_eq!(Solution::pivot_index(nums), -1);

    // Example 3
    let nums = vec![2,1,-1];
    assert_eq!(Solution::pivot_index(nums), 0);
}
