struct Solution;
impl Solution {
    pub fn flood_fill(
        image: Vec<Vec<i32>>,
        sr: i32, sc: i32, color: i32
    ) -> Vec<Vec<i32>> {
        println!("image={:?},sr={sr},sc={sc},color={color}", image);
        let starting_color = image.get(sr as usize).unwrap().get(sc as usize).unwrap();
        println!("starting_color={starting_color}");
        if starting_color == &color {
            return image;
        }
        let mut res = image.clone();
        res
    }
}

fn main() {
    // Example 1
    // let image = vec![
    //         vec![1,1,1],
    //         vec![1,1,0],
    //         vec![1,0,1],
    // ];
    // let sr = 1;
    // let sc = 1;
    // let color = 2;
    // let expected = vec![
    //         vec![2,2,2],
    //         vec![2,2,0],
    //         vec![2,0,1],
    // ];
    // assert_eq!(Solution::flood_fill(image, sr, sc, color), expected);
    
    // Example 2
    let image = vec![
            vec![0,0,0],
            vec![0,0,0],
    ];
    let sr = 0;
    let sc = 0;
    let color = 0;
    let expected = vec![
            vec![0,0,0],
            vec![0,0,0],
    ];
    assert_eq!(Solution::flood_fill(image, sr, sc, color), expected);
}