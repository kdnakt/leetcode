struct Solution;
impl Solution {
    pub fn shortest_completing_word(
        license_plate: String, words: Vec<String>
    ) -> String {
        let chars: Vec<String> = license_plate.chars()
            .filter(|&c| ('a' < c && c < 'z') || ('A' < c && c < 'Z'))
            .map(|c| c.to_lowercase().to_string())
            .collect();
        println!("{:?}", chars);
        for word in words {
            let mut target = word.clone();
            println!("{:?}", word);
            let mut result = true;
            for c in &chars {
                let ch = c.chars().next().unwrap();
                if target.contains(ch) {
                    target = target.replacen(ch, "", 1);
                    println!(" true: next target={target}");
                } else {
                    println!(" false");
                    result = false;
                    break;
                }
            }
            if result {
                return word;
            }
        }
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
