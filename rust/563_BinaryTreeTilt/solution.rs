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
        root.as_ref().map_or(0, |r| {
           let root_node = r.borrow();
           // TODO: sum left children
           let left = root_node.left.as_ref().map_or(0, |n| n.borrow().val);
           let right = root_node.right.as_ref().map_or(0, |n| n.borrow().val);
           (left - right).abs()
        }) + root.map_or(0, |r| {
            let root_node = r.borrow();
            root_node.left.as_ref().map_or(0, |n| find_tilt(Some(n)))
                + root_node.right.as_ref().map_or(0, |n| find_tilt(Some(n)))
        })
    }
}

fn find_tilt(root: Option<&Rc<RefCell<TreeNode>>>) -> i32 {
    root.map_or(0, |r| {
       let root_node = r.borrow();
       let left = root_node.left.as_ref().map_or(0, |n| n.borrow().val);
       let right = root_node.right.as_ref().map_or(0, |n| n.borrow().val);
       (left - right).abs()
    }) + root.map_or(0, |r| {
        let root_node = r.borrow();
        root_node.left.as_ref().map_or(0, |n| find_tilt(Some(n)))
            + root_node.right.as_ref().map_or(0, |n| find_tilt(Some(n)))
    })
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
}
