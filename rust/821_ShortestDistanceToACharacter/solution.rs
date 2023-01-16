struct Solution;
impl Solution {
    pub fn shortest_to_char(s: String, c: char) -> Vec<i32> {
        let mut res = Vec::new();
        let chars = s.chars();
        println!("{:?}", chars);
        for (i, _) in s.chars().enumerate() {
            res.push(shortest_to_char(&chars, i, c));
        }
        res
    }
}

fn shortest_to_char(
    chars: &std::str::Chars,
    curr: usize,
    c: char,
) -> i32 {
    if chars.clone().nth(curr).unwrap() == c {
        0
    } else {
        1
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
