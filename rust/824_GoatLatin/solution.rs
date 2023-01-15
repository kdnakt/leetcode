struct Solution;
impl Solution {
    pub fn to_goat_latin(sentence: String) -> String {
        sentence
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