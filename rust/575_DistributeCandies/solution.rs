struct Solution;
impl Solution {
    pub fn distribute_candies(mut candy_type: Vec<i32>) -> i32 {
        let half_types = candy_type.len() as i32 / 2;
        candy_type.sort();
        candy_type.dedup();
        let type_count = candy_type.len() as i32;
        if type_count < half_types {
            type_count
        } else {
            half_types
        }
    }
}

fn main() {
    // Example 1
    let candy_type = vec![1,1,2,2,3,3];
    assert_eq!(Solution::distribute_candies(candy_type), 3);

    // Example 2
    let candy_type = vec![1,1,2,3];
    assert_eq!(Solution::distribute_candies(candy_type), 2);

    // Example 3
    let candy_type = vec![6,6,6,6];
    assert_eq!(Solution::distribute_candies(candy_type), 1);
}