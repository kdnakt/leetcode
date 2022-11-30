// Definition for singly-linked list.
#[derive(PartialEq, Eq, Clone, Debug)]
pub struct ListNode {
  pub val: i32,
  pub next: Option<Box<ListNode>>
}

impl ListNode {
  #[inline]
  fn new(val: i32) -> Self {
    ListNode {
      next: None,
      val
    }
  }
}

struct Solution;
impl Solution {
    pub fn add_two_numbers(
        l1: Option<Box<ListNode>>,
        l2: Option<Box<ListNode>>
    ) -> Option<Box<ListNode>> {
        Some(Box::new(ListNode::new(0)))
    }
}

macro_rules! list_node {
    ($x:expr) => {{
        let val: i32 = $x;
        Some(Box::new(ListNode::new(val)))
    }};
    ($x:expr, $($y:expr),+) => {{
        let val: i32 = $x;
        Some(Box::new(ListNode{
            val: val,
            next: list_node!($($y),+)
        }))
    }}
}

pub fn main() {
    // example 1
    let l1 = list_node!(2, 4, 3);
    let l2 = list_node!(5, 6, 4);
    let expected = list_node!(7, 0, 8);
    assert_eq!(Solution::add_two_numbers(l1, l2), expected);

    // example 2
    let l1 = list_node!(0);
    let l2 = list_node!(0);
    assert_eq!(Solution::add_two_numbers(l1, l2), list_node!(0));

    // example 3
    let l1 = list_node!(9, 9, 9, 9, 9, 9, 9);
    let l2 = list_node!(9, 9, 9, 9);
    let expected = list_node!(8, 9, 9, 9, 0, 0, 0, 1);
    assert_eq!(Solution::add_two_numbers(l1, l2), expected);

}
