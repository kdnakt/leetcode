struct Solution;
impl Solution {
    pub fn shortest_to_char(s: String, c: char) -> Vec<i32> {
        let mut res = Vec::new();
        let chars = s.chars();
        println!("c={c},{:?}", chars);
        for (i, _) in s.chars().enumerate() {
            res.push(shortest_to_char(&chars, i, c, &res));
        }
        res
    }
}

fn shortest_to_char(
    chars: &std::str::Chars,
    curr: usize,
    c: char,
    res: &Vec<i32>,
) -> i32 {
    println!("shortest... {curr}");
    if chars.clone().nth(curr).unwrap() == c {
        return 0;
    }
    let left = if 0 < curr {
        res[curr - 1] + 1
    } else { i32::MAX };
    let right = if curr < chars.clone().count() - 1 {
        let r = find(chars, curr + 1, curr, c);
        if r == i32::MAX {
            r
        } else {
            r + 1
        }
    } else { i32::MAX };
    println!("left={left},right={right}");
    std::cmp::min(left, right)
}

fn find(
    chars: &std::str::Chars,
    curr: usize,
    org: usize,
    c: char,
) -> i32 {
    println!("finding.... {org} {curr}");
    if chars.clone().nth(curr).unwrap() == c {
        return 0;
    }
    let left = if 0 < curr && curr < org {
        find(chars, curr - 1, org, c) + 1
    } else { 0 };
    let right = if org < curr && curr < chars.clone().count() - 1 {
        let r = find(chars, curr + 1, org, c);
        if r == i32::MAX {
            r
        } else {
            r + 1
        }
    } else { i32::MAX };
    std::cmp::max(left, right)
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

    // Failed test 1
    let s = "baaa";
    let c = 'b';
    let expected = vec![0,1,2,3];
    assert_eq!(Solution::shortest_to_char(s.to_string(), c), expected);
}
