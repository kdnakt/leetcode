struct Solution;
impl Solution {
    pub fn count_bits(n: i32) -> Vec<i32> {
        Vec::new()
    }
}

fn main() {
    // Example 1
    let expected = vec![0, 1, 1];
    assert_eq!(Solution::count_bits(2), expected);

    // Example 2
    let expected = vec![0, 1, 1, 2, 1, 2];
    assert_eq!(Solution::count_bits(5), expected);
}
