package com.jacobdgraham.leetcode.Easy;

public class SymmetricTree {

    /*
    Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
        Example 1:

        Input: root = [1,2,2,3,4,4,3]
        Output: true

        Example 2:

        Input: root = [1,2,2,null,3,null,3]
        Output: false
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return nodesAreSame(root.left, root.right);
        }

        private boolean nodesAreSame(TreeNode left_node, TreeNode right_node) {
            if (left_node.left == null && right_node.right == null) {
                return true;
            }
            if (left_node.left == null || right_node.right == null) {
                return false;
            }
            return left_node.val == right_node.val && nodesAreSame(left_node.left, right_node.right) && nodesAreSame(left_node.right, right_node.right);
    }
}
