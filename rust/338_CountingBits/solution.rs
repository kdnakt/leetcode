struct Solution;
impl Solution {
    pub fn count_bits(n: i32) -> Vec<i32> {
        let mut vec = Vec::new();
        for i in 0..=n {
            vec.push(count(i));
        }
        vec
    }
}

fn count(mut i: i32) -> i32 {
    let mut count = 0;
    while i > 0 {
        count += i & 1;
        i = i >> 1;
    }
    count
}

fn main() {
    // Example 1
    let expected = vec![0, 1, 1];
    assert_eq!(Solution::count_bits(2), expected);

    // Example 2
    let expected = vec![0, 1, 1, 2, 1, 2];
    assert_eq!(Solution::count_bits(5), expected);
}
