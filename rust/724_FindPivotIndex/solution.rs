struct Solution;
impl Solution {
    pub fn pivot_index(nums: Vec<i32>) -> i32 {
        let mut left_sum = 0;
        let mut right_sum = nums.clone().into_iter()
                .fold(0, |acc, num| acc + num);
        for (i, e) in nums.iter().enumerate() {
            right_sum -= e;
            if left_sum == right_sum {
                return i as i32;
            }
            left_sum += e;
        }
        -1
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
