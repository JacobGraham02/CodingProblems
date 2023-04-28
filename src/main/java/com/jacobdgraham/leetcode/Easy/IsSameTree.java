package com.jacobdgraham.leetcode.Easy;

import org.w3c.dom.Node;

import java.util.Stack;

public class IsSameTree {

    /*
    Given the roots of two binary trees p and q, write a function to check if they are the same or not.

    Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

    Example 1:
        Input: p = [1,2,3], q = [1,2,3]
        Output: true

    Example 2:
        Input: p = [1,2], q = [1,null,2]
        Output: false

     */

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isSameTreeRecursion(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        boolean leftSubtreeSame = isSameTreeRecursion(p.left, q.left);
        boolean rightSubtreeSame = isSameTreeRecursion(p.right, q.right);

        return leftSubtreeSame && rightSubtreeSame;
    }

    public boolean isSameTreeIterative(TreeNode p, TreeNode q) {
        Stack<TreeNode> leftSubtree = new Stack<>();
        Stack<TreeNode> rightSubtree = new Stack<>();

        leftSubtree.push(p);
        rightSubtree.push(q);

        while (!leftSubtree.isEmpty() && !rightSubtree.isEmpty()) {
            TreeNode currentLeftSubtree = leftSubtree.pop();
            TreeNode currentRightSubtree = rightSubtree.pop();

            if (currentRightSubtree == null && currentLeftSubtree == null) {
                continue;
            }
            if (currentRightSubtree == null || currentLeftSubtree == null) {
                return false;
            }
            if (currentRightSubtree.val != currentLeftSubtree.val) {
                return false;
            }
            leftSubtree.push(currentLeftSubtree.right);
            leftSubtree.push(currentLeftSubtree.left);
            leftSubtree.push(currentRightSubtree.right);
            leftSubtree.push(currentRightSubtree.left);
        }

        return leftSubtree.isEmpty() && rightSubtree.isEmpty();
    }
}
