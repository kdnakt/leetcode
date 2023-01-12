struct Solution;
impl Solution {
    pub fn next_greatest_letter(
        letters: Vec<char>, target: char
    ) -> char {
        if letters[letters.len() - 1] < target {
            return letters[0];
        }
        for c in letters.iter() {
            if target < *c {
                return *c;
            }
        }
        letters[0]
    }
}

fn main() {
    // Example 1
    let letters = vec!['c','f','j'];
    let target = 'a';
    assert_eq!(Solution::next_greatest_letter(letters, target), 'c');

    // Example 2
    let letters = vec!['c','f','j'];
    let target = 'c';
    assert_eq!(Solution::next_greatest_letter(letters, target), 'f');

    // Example 3
    let letters = vec!['x','x','y','y'];
    let target = 'z';
    assert_eq!(Solution::next_greatest_letter(letters, target), 'x');
}