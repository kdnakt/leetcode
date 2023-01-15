struct Solution;
impl Solution {
    pub fn to_goat_latin(sentence: String) -> String {
        let mut goat = Vec::new();
        for (i, w) in sentence.split_ascii_whitespace().enumerate() {
            let mut word = w.to_owned();
            let mut latin: String = match word.chars().next() {
                Some('a' | 'i' | 'e' | 'u' | 'o' | 'A' | 'E' | 'I' | 'U' | 'O') => word + "ma",
                Some(c) => {
                    let mut chars = word.chars();
                    chars.next();
                    chars.as_str().to_owned() + &c.to_string() + "ma"
                },
                None => panic!("first char is None"),
            };
            for _ in 0..(i+1) {
                latin.push_str("a");
            }
            goat.push(latin);
        }
        goat.join(" ")
    }
}

fn main() {
    // Example 1
    let sentence = "I speak Goat Latin";
    let expected = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa";
    assert_eq!(Solution::to_goat_latin(sentence.to_string()), expected.to_string());

    // Example 2
    let sentence = "The quick brown fox jumped over the lazy dog";
    let expected = "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa";
    assert_eq!(Solution::to_goat_latin(sentence.to_string()), expected.to_string());
}