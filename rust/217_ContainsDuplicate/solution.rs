struct Solution;
impl Solution {
    pub fn contains_duplicate(
        nums: Vec<i32>
    ) -> bool {
        false
    }
}

pub fn main() {
    let nums = vec![1, 2, 3, 1];
    assert_eq!(Solution::contains_duplicate(nums), true);
    
    let nums = vec![1, 2, 3, 4];
    assert_eq!(Solution::contains_duplicate(nums), false);

    let nums = vec![1,1,1,3,3,4,5,2,4,2];
    assert_eq!(Solution::contains_duplicate(nums), true);
}
