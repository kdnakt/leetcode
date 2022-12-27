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
        merge_trees(root1.as_ref(), root2.as_ref())
    }
}

pub fn merge_trees(
    root1: Option<&Rc<RefCell<TreeNode>>>,
    root2: Option<&Rc<RefCell<TreeNode>>>
) -> Option<Rc<RefCell<TreeNode>>> {
    let r1 = match root1 {
        Some(ref r1) => r1,
        None => return root2.map(|n| Rc::clone(n)),
    };
    let r2 = match root2 {
        Some(ref r2) => r2.borrow(),
        None => return Some(Rc::clone(r1)),
    };
    let r1 = r1.borrow();
    tree_nodes(r1.val + r2.val,
        merge_trees(r1.left.as_ref(), r2.left.as_ref()),
        merge_trees(r1.right.as_ref(), r2.right.as_ref())
    )
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
    // Example 0
    let root1 = tree_node(3);
    let root2 = tree_node(5);
    let expected = tree_node(8);
    assert_eq!(Solution::merge_trees(root1, root2), expected);
//     // Example 2
//     let root1 = tree_node(3);
//     let root2 = tree_nodes(5, tree_node(7), None);
//     let expected = tree_nodes(8, tree_node(7), None);
//     assert_eq!(Solution::merge_trees(root1, root2), expected);
// }

// fn main2() {
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
