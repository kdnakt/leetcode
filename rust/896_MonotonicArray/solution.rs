struct Solution;
impl Solution {
    pub fn is_monotonic(nums: Vec<i32>) -> bool {
        if nums.len() <= 2 {
            return true;
        }
        let mut increasing = false;
        let mut decreasing = false;
        for i in 0..nums.len()-1 {
            if nums[i] == nums[i+1] {
                continue;
            }
            if nums[i] < nums[i+1] {
                increasing = true;
            }
            if nums[i] > nums[i+1] {
                decreasing = true;
            }
            if increasing && decreasing {
                return false;
            }
        }
        true
    }
}

fn main() {
    // Example 0
    let nums = vec![1];
    assert_eq!(Solution::is_monotonic(nums), true);
    let nums = vec![1,2];
    assert_eq!(Solution::is_monotonic(nums), true);

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