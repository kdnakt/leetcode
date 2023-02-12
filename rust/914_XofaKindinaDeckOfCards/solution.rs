struct Solution;
impl Solution {
    pub fn has_groups_size_x(deck: Vec<i32>) -> bool {
        if deck.len() == 1 {
            return false;
        }
        if deck.len() == 2 {
            return deck[0] == deck[1];
        }
        false
    }
}

fn main() {
    // len == 1 is always false
    let deck = vec![1];
    assert_eq!(Solution::has_groups_size_x(deck), false);

    // len == 2, the same number
    let deck = vec![2,2];
    assert_eq!(Solution::has_groups_size_x(deck), true);

    // len == 2, different number
    let deck = vec![3,4];
    assert_eq!(Solution::has_groups_size_x(deck), false);

    // Example 1
    let deck = vec![1,2,3,4,4,3,2,1];
    assert_eq!(Solution::has_groups_size_x(deck), true);

    // Example 2
    let deck = vec![1,1,1,2,2,2,3,3];
    assert_eq!(Solution::has_groups_size_x(deck), false);
}