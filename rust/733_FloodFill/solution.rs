struct Solution;
impl Solution {
    pub fn flood_fill(
        image: Vec<Vec<i32>>,
        sr: i32, sc: i32, color: i32
    ) -> Vec<Vec<i32>> {
        println!("\nimage={:?},sr={sr},sc={sc},color={color}", image);
        let starting_color = image.get(sr as usize).unwrap().get(sc as usize).unwrap();
        println!("starting_color={starting_color}");
        if starting_color == &color {
            return image;
        }
        let mut res = image.clone();
        let m = image.len();
        let n = image.get(0).unwrap().len();
        println!("m={m},n={n}");
        for i in 0..m {
            let row: &mut Vec<i32> = res.get_mut(i).unwrap();
            for j in 0..n {
                println!("i={i},j={j}");
                if image.get(i).unwrap().get(j).unwrap() == starting_color {
                    let north = if 0 < i {
                        image.get(i - 1).unwrap().get(j).unwrap() == starting_color
                    } else { false };
                    let west = if 0 < j {
                        image.get(i).unwrap().get(j - 1).unwrap() == starting_color
                    } else { false };
                    let south = if i + 1 < m {
                        image.get(i + 1).unwrap().get(j).unwrap() == starting_color
                    } else { false };
                    let east = if j + 1 < n {
                        image.get(i).unwrap().get(j + 1).unwrap() == starting_color
                    } else { false };
                    println!("north={north},west={west},east={east},south={south}");
                    if north || west || east || south {
                        row.insert(j, color);
                        row.remove(j + 1);
                    }
                }
            }
        }
        res
    }
}

fn main() {
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

    // Simple case
    let image = vec![
            vec![1,1,1],
            vec![0,0,1],
    ];
    let sr = 0;
    let sc = 0;
    let color = 2;
    let expected = vec![
            vec![2,2,2],
            vec![0,0,2],
    ];
    assert_eq!(Solution::flood_fill(image, sr, sc, color), expected);

    // Simple case 2
    let image = vec![
            vec![1,1,1],
            vec![0,0,1],
    ];
    let sr = 1;
    let sc = 0;
    let color = 2;
    let expected = vec![
            vec![1,1,1],
            vec![2,2,1],
    ];
    assert_eq!(Solution::flood_fill(image, sr, sc, color), expected);

    // Example 1
    let image = vec![
            vec![1,1,1],
            vec![1,1,0],
            vec![1,0,1],
    ];
    let sr = 1;
    let sc = 1;
    let color = 2;
    let expected = vec![
            vec![2,2,2],
            vec![2,2,0],
            vec![2,0,1],
    ];
    assert_eq!(Solution::flood_fill(image, sr, sc, color), expected);

    // Float Example
    let image = vec![
            vec![1,0,1],
            vec![1,0,1],
    ];
    let sr = 0;
    let sc = 2;
    let color = 2;
    let expected = vec![
            vec![1,0,2],
            vec![1,0,2],
    ];
    assert_eq!(Solution::flood_fill(image, sr, sc, color), expected);
}