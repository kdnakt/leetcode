struct Solution;
impl Solution {
    pub fn maximum_product(mut nums: Vec<i32>) -> i32 {
        nums.sort();
        let len = nums.len();
        let mut iter = nums.iter();
        iter.nth(len - 3).unwrap() * iter.next().unwrap() * iter.next().unwrap()
    }
}

fn main() {
    // Example 1
    let nums = vec![1,2,3];
    assert_eq!(Solution::maximum_product(nums), 6);

    // Example 2
    let nums = vec![1,2,3,4];
    assert_eq!(Solution::maximum_product(nums), 24);

    // Example 3
    let nums = vec![-1,-2,-3];
    assert_eq!(Solution::maximum_product(nums), -6);

    // Example 4
    let nums = vec![2,2,3,4];
    assert_eq!(Solution::maximum_product(nums), 24);
}