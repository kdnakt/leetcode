struct Solution;
impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut res = Vec::new();
        for (i, x) in nums.iter().enumerate() {
            let expected = target - x;
            for (j, y) in nums.iter().enumerate() {
                if expected == *y && i != j {
                    res.push(i as i32);
                    res.push(j as i32);
                    return res;
                }
            }
        }
        panic!("not found");
    }
}

pub fn main() {
    let nums = vec![2, 7, 9, 11];
    let expected = vec![0, 1];
    assert_eq!(Solution::two_sum(nums, 9), expected);
    
    let nums = vec![3, 2, 4];
    let expected = vec![1, 2];
    assert_eq!(Solution::two_sum(nums, 6), expected);
}
