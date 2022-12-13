struct Solution;
impl Solution {
    pub fn find_error_nums(nums: Vec<i32>) -> Vec<i32> {
        let mut res = Vec::new();
        let len = nums.len() as i32;
        let iter = nums.into_iter();
        let mut found_zero = false;
        let mut found_two = false;
        for i in 1..=len {
            let c = iter.clone().filter(|x| x == &i).count();
            if c == 0 {
                found_zero = true;
                res.push(i);
            } else if c == 2 {
                found_two = true;
                res.insert(0, i);
            }
            if found_zero && found_two {
                break;
            }
        }
        return res;
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