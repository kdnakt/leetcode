struct Solution;
impl Solution {
    pub fn can_place_flowers(flowerbed: Vec<i32>, n: i32) -> bool {
        println!("\nvec={:?}", flowerbed);
        let mut queue = MyQueue::new();
        flowerbed.into_iter().for_each(|i| queue.push(i));

        let mut available_count = 0;
        let mut prev = 0;
        let mut curr = queue.pop();
        let mut next = queue.peek();
        loop {
            println!("{} {} {}", prev, curr, next);
            if prev == 0 && curr == 0 && next == 0 {
                println!("  available!");
                available_count += 1;
                prev = 1;
            } else {
                prev = curr;
            }
            if !queue.has_next() {
                break;
            }
            curr = queue.pop();
            next = queue.peek();
        }
        println!("{} == {} ?", n, available_count);
        n <= available_count
    }
}

struct MyQueue {
    vec: Vec<i32>,
    curr: usize,
}
impl MyQueue {
    fn new() -> Self {
        MyQueue{
            vec: Vec::new(),
            curr: 0,
        }
    }

    fn push(&mut self, x: i32) {
        self.vec.push(x);
    }
    
    fn pop(&mut self) -> i32 {
        let v = *self.vec.get(self.curr).unwrap_or(&0);
        self.curr += 1;
        v
    }
    
    fn peek(&mut self) -> i32 {
        *self.vec.get(self.curr).unwrap_or(&0)
    }
    
    fn has_next(&self) -> bool {
        let len = self.vec.len();
        self.curr < len
    }
}

fn main() {
    // Example 1
    let flowerbed = vec![1,0,0,0,1];
    let n = 1;
    assert_eq!(Solution::can_place_flowers(flowerbed, n), true);

    // Example 2
    let flowerbed = vec![1,0,0,0,1];
    let n = 2;
    assert_eq!(Solution::can_place_flowers(flowerbed, n), false);
    
    // Failed
    let flowerbed = vec![1,0,0,0,0,1];
    let n = 2;
    assert_eq!(Solution::can_place_flowers(flowerbed, n), false);
    
    // Failed
    let flowerbed = vec![1,0,0,0,1,0,0];
    let n = 2;
    assert_eq!(Solution::can_place_flowers(flowerbed, n), true);
    
    // Failed
    let flowerbed = vec![0,0,1,0,0];
    let n = 1;
    assert_eq!(Solution::can_place_flowers(flowerbed, n), true);
}