// Definition for a binary tree node.
#[derive(Debug, PartialEq, Eq)]
pub struct TreeNode {
  pub val: i32,
  pub left: Option<Rc<RefCell<TreeNode>>>,
  pub right: Option<Rc<RefCell<TreeNode>>>,
}

impl TreeNode {
  #[inline]
  pub fn new(val: i32) -> Self {
    TreeNode {
      val,
      left: None,
      right: None
    }
  }
}
struct Solution;
use std::rc::Rc;
use std::cell::RefCell;
impl Solution {
    pub fn find_tilt(root: Option<Rc<RefCell<TreeNode>>>) -> i32 {
        find_tilt(root.as_ref())
    }
}

fn find_tilt(root: Option<&Rc<RefCell<TreeNode>>>) -> i32 {
    root.as_ref().map_or(0, |r| {
        let root = r.borrow();
        let left = root.left.as_ref().map_or(0, |n| sum_subtree(n));
        let right = root.right.as_ref().map_or(0, |n| sum_subtree(n));
        (left - right).abs()
                + find_tilt(root.left.as_ref())
                + find_tilt(root.right.as_ref())
    })
}

fn sum_subtree(subtree: &Rc<RefCell<TreeNode>>) -> i32 {
    let node = subtree.borrow();
    node.val + node.left.as_ref().map_or(0, |n| sum_subtree(&n))
        + node.right.as_ref().map_or(0, |n| sum_subtree(&n))
}

fn tree_node(
    val: i32,
    left: Option<Rc<RefCell<TreeNode>>>,
    right: Option<Rc<RefCell<TreeNode>>>,
) -> Option<Rc<RefCell<TreeNode>>> {
    Some(Rc::new(RefCell::new(TreeNode{
        val,
        left,
        right,
    })))
}

fn main() {
    let root = tree_node(1, None, None);
    assert_eq!(Solution::find_tilt(root), 0);

    // Example 1
    let root = tree_node(1,
        tree_node(2, None, None),
        tree_node(3, None, None)
    );
    assert_eq!(Solution::find_tilt(root), 1);

    // Example 2
    let root = tree_node(4,
        tree_node(2,
            tree_node(3, None, None),
            tree_node(5, None, None),
        ),
        tree_node(9,
            None,
            tree_node(7, None, None),
        )
    );
    assert_eq!(Solution::find_tilt(root), 15);
}
