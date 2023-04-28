package com.jacobdgraham.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversalRecursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result; 
    }
        
    public void helper(TreeNode root, List<Integer> result) {
        if (root != null) {
            helper(root.left, result);
            result.add(root.val);
            helper(root.right, result);
        }
    }

    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> array_list_treenode_values = new ArrayList<Integer>();
        Stack<TreeNode> stack_treenodes = new Stack<TreeNode>();
        
        TreeNode current_treenode = root;
        
        while (current_treenode != null || !stack_treenodes.empty()) {
            while (current_treenode != null) {
                stack_treenodes.add(current_treenode);
                current_treenode = current_treenode.left;
            }
            current_treenode = stack_treenodes.pop();
            array_list_treenode_values.add(current_treenode.val);
            current_treenode = current_treenode.right;
        }
        return array_list_treenode_values;
    }
}
