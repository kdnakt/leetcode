struct Solution;
impl Solution {
    pub fn find_error_nums(nums: Vec<i32>) -> Vec<i32> {
        // nums.sort();
        let mut expected = Vec::new();
        for i in 1..=nums.len() {
            expected.push(i as i32);
        }
        for (n, e) in nums.iter().zip(expected.iter()) {
            if n != e {
                return vec![*n, *e];
            }
        }
        Vec::new()
    }
}

fn main() {
    // Example 1
    let nums = vec![1,2,2,4];
    let expected = vec![2,3];
    assert_eq!(Solution::find_error_nums(nums), expected);
    // Example 2
    let nums = vec![1,1];
    let expected = vec![1,2];
    assert_eq!(Solution::find_error_nums(nums), expected);
    // Example 3
    let nums = vec![3,2,3,4,6,5];
    let expected = vec![3,1];
    assert_eq!(Solution::find_error_nums(nums), expected);
    // Example 4
    let nums = vec![3,2,2];
    let expected = vec![2,1];
    assert_eq!(Solution::find_error_nums(nums), expected);
}