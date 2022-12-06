struct Solution;
impl Solution {
    pub fn array_pair_sum(mut nums: Vec<i32>) -> i32 {
        nums.sort();
        let mut res = 0;
        for (i, n) in nums.iter().enumerate() {
            if i % 2 == 0 {
                res += n;
            }
        }
        res
    }
}

fn main() {
    // Example 1
    let nums = vec![1,4,3,2];
    assert_eq!(Solution::array_pair_sum(nums), 4);
    
    // Example 2
    let nums = vec![6,2,6,5,1,2];
    assert_eq!(Solution::array_pair_sum(nums), 9);
}