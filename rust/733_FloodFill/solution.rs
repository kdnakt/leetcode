struct Solution;
impl Solution {
    pub fn flood_fill(
        image: Vec<Vec<i32>>,
        sr: i32, sc: i32, color: i32
    ) -> Vec<Vec<i32>> {
        println!("\n*****\nimage={:?},sr={sr},sc={sc},color={color}", image);
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
                if is_reachable(&image, sr as usize, sc as usize, i, j, m, n, Vec::new(), starting_color) {
                    println!("  Reachable\n");
                    row.insert(j, color);
                    row.remove(j + 1);
                } else {
                    println!("  Not Reachable\n");
                }
            }
        }
        res
    }
}

fn is_reachable(
    image: &Vec<Vec<i32>>,
    sr: usize, sc: usize,
    i: usize, j: usize,
    m: usize, n: usize,
    mut cache: Vec<String>,
    starting_color: &i32
) -> bool {
    println!("i={i},j={j},cache={:?}", cache);
    if sr == i && sc == j {
        let cache_key = format!("{:02}{:02}", i, j);
        cache.push(cache_key);
        println!("  is source");
        return true;
    }
    if image.get(i).unwrap().get(j).unwrap() != starting_color {
        let cache_key = format!("{:02}{:02}", i, j);
        cache.push(cache_key);
        println!("  is NOT reachable (wrong color)");
        return false;
    }
    if 0 < i {
        let cache_key = format!("{:02}{:02}", i - 1, j);
        if cache.contains(&cache_key) {
            println!("  is coming from south");
            return false;
        }
        cache.push(cache_key);
        if is_reachable(image, sr, sc, i - 1, j, m, n, cache.clone(), starting_color) {
            println!("  is reachable from south");
            return true;
        }
    }
    if 0 < j {
        let cache_key = format!("{:02}{:02}", i, j - 1);
        if cache.contains(&cache_key) {
            println!("  is coming from east");
            return false;
        }
        cache.push(cache_key);
        if is_reachable(image, sr, sc, i, j - 1, m, n, cache.clone(), starting_color) {
            println!("  is reachable from east");
            return true;
        }
    }
    if i + 1 < m {
        let cache_key = format!("{:02}{:02}", i + 1, j);
        if cache.contains(&cache_key) {
            println!("  is coming from north");
            return false;
        }
        cache.push(cache_key);
        if is_reachable(image, sr, sc, i + 1, j, m, n, cache.clone(), starting_color) {
            println!("  is reachable from north");
            return true;
        }
    }
    if j + 1 < n {
        let cache_key = format!("{:02}{:02}", i, j + 1);
        if cache.contains(&cache_key) {
            println!("  is coming from west");
            return false;
        }
        cache.push(cache_key);
        if is_reachable(image, sr, sc, i, j + 1, m, n, cache.clone(), starting_color) {
            println!("  is reachable from west");
            return true;
        }
    }
    let cache_key = format!("{:02}{:02}", i, j);
    cache.push(cache_key);
    println!("  is NOT reachable (no path)");
    false
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

    // Failed test 1
    let image = vec![
        vec![0,0,0],
        vec![0,0,0],
    ];
    let sr = 1;
    let sc = 0;
    let color = 2;
    let expected = vec![
        vec![2,2,2],
        vec![2,2,2],
    ];
    assert_eq!(Solution::flood_fill(image, sr, sc, color), expected);

    // Failed test 2
    let image = vec![
        vec![0,1,1],
        vec![1,1,1],
    ];
    let sr = 1;
    let sc = 0;
    let color = 2;
    let expected = vec![
        vec![0,2,2],
        vec![2,2,2],
    ];
    assert_eq!(Solution::flood_fill(image, sr, sc, color), expected);
}