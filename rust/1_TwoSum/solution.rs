struct Solution;
use std::collections::HashMap;
impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut map = HashMap::new();
        nums.iter().enumerate()
            .for_each(|(i, x)| {
                map.insert(x, i);
                ()
            });
        for (i, x) in nums.iter().enumerate() {
            let expected = target - x;
            if map.contains_key(&expected) {
                match map.get(&expected) {
                    Some(index) => {
                        if i != *index {
                            return vec![i as i32, *index as i32];
                        }
                    },
                    None => (),
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
