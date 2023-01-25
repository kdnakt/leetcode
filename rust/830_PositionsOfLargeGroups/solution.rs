struct Solution;
impl Solution {
    pub fn large_group_positions(s: String) -> Vec<Vec<i32>> {
        Vec::new()
    }
}

fn main() {
    // Example 1
    let s = "abbxxxxzzy";
    let expected = vec![vec![3,6]];
    assert_eq!(Solution::large_group_positions(s.to_string()), expected);

    // Example 2
    let s = "abc";
    let expected = vec![];
    assert_eq!(Solution::large_group_positions(s.to_string()), expected);

    // Example 3
    let s = "abcdddeeeeaabbbcd";
    let expected = vec![vec![3,5],vec![6,9],vec![12,14]];
    assert_eq!(Solution::large_group_positions(s.to_string()), expected);
}