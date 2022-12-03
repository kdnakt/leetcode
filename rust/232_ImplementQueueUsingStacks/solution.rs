struct MyQueue {
    vec: Vec<i32>,
    curr: usize,
}


/** 
 * `&self` means the method takes an immutable reference.
 * If you need a mutable reference, change it to `&mut self` instead.
 */
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
    
    fn empty(&self) -> bool {
        self.vec.len() - 1 != self.curr
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * let obj = MyQueue::new();
 * obj.push(x);
 * let ret_2: i32 = obj.pop();
 * let ret_3: i32 = obj.peek();
 * let ret_4: bool = obj.empty();
 */

fn main() {
    // Example 1
    let mut obj = MyQueue::new();
    obj.push(1);
    obj.push(2);
    assert_eq!(obj.peek(), 1);
    assert_eq!(obj.pop(), 1);
    assert_eq!(obj.empty(), false);
}