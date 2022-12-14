struct Solution;
impl Solution {
    pub fn cal_points(operations: Vec<String>) -> i32 {
        operations.into_iter().fold(0, |acc, op| {
            acc
        })
    }
}

fn string_vec(ops: Vec<&str>) -> Vec<String> {
    let mut res = Vec::new();
    ops.into_iter().for_each(|op| res.push(String::from(op)));
    res
}

fn main() {
    // Example 1
    let ops = string_vec(vec!["5","2","C","D","+"]);
    assert_eq!(Solution::cal_points(ops), 30);
    
    // Example 2
    let ops = string_vec(vec!["5","-2","4","C","D","9","+","+"]);
    assert_eq!(Solution::cal_points(ops), 27);
    
    //Example 3
    let ops = string_vec(vec!["1","C"]);
    assert_eq!(Solution::cal_points(ops), 0);
}