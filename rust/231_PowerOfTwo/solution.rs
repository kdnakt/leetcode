struct Solution;
impl Solution {
    pub fn is_power_of_two(n: i32) -> bool {
        if n == 0 {
            false
        } else if n == 1 {
            true
        } else if n % 2 == 1 {
            false
        } else {
            Solution::is_power_of_two(n / 2)
        }
    }
}

fn main() {
    // Example 1
    assert_eq!(Solution::is_power_of_two(1), true);
    // Example 2
    assert_eq!(Solution::is_power_of_two(16), true);
    // Example 3
    assert_eq!(Solution::is_power_of_two(3), false);
}
