struct Solution;
impl Solution {
    pub fn shortest_to_char(s: String, c: char) -> Vec<i32> {
        Vec::new()
    }
}

fn main() {
    // Example 1
    let s = "loveleetcode";
    let c = 'e';
    let expected = vec![3,2,1,0,1,0,0,1,2,2,1,0];
    assert_eq!(Solution::shortest_to_char(s.to_string(), c), expected);

    // Example 2
    let s = "aaab";
    let c = 'b';
    let expected = vec![3,2,1,0];
    assert_eq!(Solution::shortest_to_char(s.to_string(), c), expected);
}
