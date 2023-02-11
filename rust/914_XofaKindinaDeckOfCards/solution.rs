struct Solution;
impl Solution {
    pub fn has_groups_size_x(deck: Vec<i32>) -> bool {
        false
    }
}

fn main() {
    // Example 1
    let deck = vec![1,2,3,4,4,3,2,1];
    assert_eq!(Solution::has_groups_size_x(deck), true);

    // Example 2
    let deck = vec![1,1,1,2,2,2,3,3];
    assert_eq!(Solution::has_groups_size_x(deck), false);
}