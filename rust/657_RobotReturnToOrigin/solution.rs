struct Solution;
impl Solution {
    pub fn judge_circle(moves: String) -> bool {
        let mut v = 0;
        let mut h = 0;
        moves.chars().for_each(|c| {
            match c {
                'U' => v += 1,
                'D' => v -= 1,
                'L' => h -= 1,
                'R' => h += 1,
                _ => (),
            }
        });
        v == 0 && h == 0
    }
}

fn main() {
    // Example 1
    let moves = String::from("UD");
    assert_eq!(Solution::judge_circle(moves), true);

    // Example 2
    let moves = String::from("LL");
    assert_eq!(Solution::judge_circle(moves), false);
}
