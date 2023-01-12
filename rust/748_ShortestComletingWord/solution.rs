struct Solution;
impl Solution {
    pub fn shortest_completing_word(
        license_plate: String, words: Vec<String>
    ) -> String {
        license_plate
    }
}

fn main() {
    // Example 1
    let license_plate = "1s3 PSt".to_string();
    let words = vec![
        "step".to_string(),
        "steps".to_string(),
        "stripe".to_string(),
        "stepple".to_string(),
    ];
    assert_eq!(Solution::shortest_completing_word(license_plate, words), "steps".to_string());

    // Example 2
    let license_plate = "1s3 456".to_string();
    let words = vec![
        "looks".to_string(),
        "pest".to_string(),
        "stew".to_string(),
        "show".to_string(),
    ];
    assert_eq!(Solution::shortest_completing_word(license_plate, words), "pest".to_string());

}
