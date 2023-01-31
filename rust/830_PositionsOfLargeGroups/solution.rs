struct Solution;
impl Solution {
    pub fn large_group_positions(s: String) -> Vec<Vec<i32>> {
        let mut res = Vec::new();
        let mut curr = ' ';
        let mut start = 0;
        for (index, c) in s.char_indices() {
            if curr != c {
                if 2 < index - start {
                    res.push(vec![start as i32, (index - 1) as i32]);
                }
                start = index;
            }
            curr = c;
        }
        res
    }
}

fn main() {
    // Example 1
    let s = "abbxxxxzzy";
    let expected = vec![vec![3,6]];
    assert_eq!(Solution::large_group_positions(s.to_string()), expected);

    // Example 2
    let s = "abc";
    let expected: Vec<Vec<i32>> = vec![];
    assert_eq!(Solution::large_group_positions(s.to_string()), expected);

    // Example 3
    let s = "abcdddeeeeaabbbcd";
    let expected = vec![vec![3,5],vec![6,9],vec![12,14]];
    assert_eq!(Solution::large_group_positions(s.to_string()), expected);
}