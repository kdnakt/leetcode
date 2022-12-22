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
    pub fn merge_trees(
        root1: Option<Rc<RefCell<TreeNode>>>,
        root2: Option<Rc<RefCell<TreeNode>>>
    ) -> Option<Rc<RefCell<TreeNode>>> {
        None
    }
}

fn tree_node(val: i32) -> Option<Rc<RefCell<TreeNode>>> {
    tree_nodes(val, None, None)
}

fn tree_nodes(
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
    // Example 1
    let root1 = tree_nodes(1,
        tree_nodes(3, tree_node(5), None),
        tree_node(2)
    );
    let root2 = tree_nodes(2,
        tree_nodes(1, None, tree_node(4)),
        tree_nodes(3, None, tree_node(7))
    );
    let expected = tree_nodes(3,
        tree_nodes(4, tree_node(5), tree_node(4)),
        tree_nodes(5, None, tree_node(7))
    );
    assert_eq!(Solution::merge_trees(root1, root2), expected);
    
    // Example 2
    let root1 = tree_node(1);
    let root2 = tree_nodes(1, tree_node(2), None);
    let expected = tree_nodes(2, tree_node(2), None);
    assert_eq!(Solution::merge_trees(root1, root2), expected);
}
