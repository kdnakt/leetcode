struct Solution;
impl Solution {
    pub fn matrix_reshape(mat: Vec<Vec<i32>>, r: i32, c: i32) -> Vec<Vec<i32>> {
        let org_r = mat.len() as i32;
        let org_c = mat.first().unwrap().len() as i32;
        if org_c <= c && org_r <= r {
            return mat;
        }
        if r * c < org_c * org_r {
            return mat;
        }
        let mut vec = Vec::new();
        mat.into_iter().for_each(|v| v.into_iter().for_each(|i| vec.push(i)));
        let mut res = Vec::new();
        vec.chunks(c as usize).for_each(|c| res.push(c.to_vec()));
        res
    }
}

fn main() {
    // Example 1
    let mat = vec![vec![1, 2], vec![3, 4]];
    let expected = vec![vec![1, 2, 3, 4]];
    assert_eq!(Solution::matrix_reshape(mat, 1, 4), expected);

    // Example 2
    let mat = vec![vec![1, 2], vec![3, 4]];
    let expected = vec![vec![1, 2], vec![3, 4]];
    assert_eq!(Solution::matrix_reshape(mat, 2, 4), expected);
    
    // Example 3
    let mat = vec![vec![1, 2, 3], vec![4, 5, 6]];
    let expected = vec![vec![1, 2], vec![3, 4], vec![5, 6]];
    assert_eq!(Solution::matrix_reshape(mat, 3, 2), expected);
    
    // Failed test
    let mat = vec![vec![1, 2]];
    let expected = vec![vec![1, 2]];
    assert_eq!(Solution::matrix_reshape(mat, 1, 1), expected);
}