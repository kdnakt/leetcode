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
    // example 1
    let l1 = Some(Box::new(ListNode{
        val: 2,
        next: Some(Box::new(ListNode{
            val: 4,
            next: Some(Box::new(ListNode::new(3)))
        }))
    }));
    let l2 = Some(Box::new(ListNode{
        val: 5,
        next: Some(Box::new(ListNode{
            val: 6,
            next: Some(Box::new(ListNode::new(4)))
        }))
    }));
    let expected = Some(Box::new(ListNode{
        val: 7,
        next: Some(Box::new(ListNode{
            val: 0,
            next: Some(Box::new(ListNode::new(8)))
        }))
    }));
    assert_eq!(Solution::add_two_numbers(l1, l2), expected);

    // example 2
    let l1 = Some(Box::new(ListNode::new(0)));
    let l2 = Some(Box::new(ListNode::new(0)));
    assert_eq!(Solution::add_two_numbers(l1, l2), Some(Box::new(ListNode::new(0))));

    // example 3
    let l1 = Some(Box::new(ListNode{
        val: 9,
        next: Some(Box::new(ListNode{
            val: 9,
            next: Some(Box::new(ListNode{
                val: 9,
                next: Some(Box::new(ListNode{
                    val: 9,
                    next: Some(Box::new(ListNode{
                        val: 9,
                        next: Some(Box::new(ListNode{
                            val: 9,
                            next: Some(Box::new(ListNode::new(9)))
                        }))
                    }))
                }))
            }))
        }))
    }));
    let l2 = Some(Box::new(ListNode{
        val: 9,
        next: Some(Box::new(ListNode{
            val: 9,
            next: Some(Box::new(ListNode{
                val: 9,
                next: Some(Box::new(ListNode::new(9)))
            }))
        }))
    }));
    let expected = Some(Box::new(ListNode{
        val: 8,
        next: Some(Box::new(ListNode{
            val: 9,
            next: Some(Box::new(ListNode{
                val: 9,
                next: Some(Box::new(ListNode{
                    val: 9,
                    next: Some(Box::new(ListNode{
                        val: 0,
                        next: Some(Box::new(ListNode{
                            val: 0,
                            next: Some(Box::new(ListNode{
                                val: 0,
                                next: Some(Box::new(ListNode::new(1)))
                            }))
                        }))
                    }))
                }))
            }))
        }))
    }));
    assert_eq!(Solution::add_two_numbers(l1, l2), expected);

}
