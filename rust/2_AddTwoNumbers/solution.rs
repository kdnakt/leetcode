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

pub fn main() {
    let l1 = Some(Box::new(ListNode::new(0)));
    let l2 = Some(Box::new(ListNode::new(0)));
    assert_eq!(Solution::add_two_numbers(l1, l2), Some(Box::new(ListNode::new(0))));
}
