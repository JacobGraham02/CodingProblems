package com.jacobdgraham.leetcode.Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.jacobdgraham.leetcode.Easy.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMaximumDepthBinaryTree {

    private MaximumDepthBinaryTree maximumDepthBinaryTree;

    @BeforeEach
    void setUp() {
        maximumDepthBinaryTree = new MaximumDepthBinaryTree();
    }

    @Test
    public void testMaximumDepthBinaryTreeWithNullRoot() {
        TreeNode nullTreeNode;
        nullTreeNode = null;
        int maxDepthResult = maximumDepthBinaryTree.maxDepthRecursion(nullTreeNode);
        int expectedResult = 0;
        assertEquals(expectedResult, maxDepthResult);
    }

    @Test
    public void testMaximumDepthBinaryTreeOnlyRootNode() {
        TreeNode treeNode = new TreeNode(7);
        treeNode.left = null;
        treeNode.right = null;
        int maxDepthResult = maximumDepthBinaryTree.maxDepthRecursion(treeNode);
        int expectedResult = 1;
        assertEquals(expectedResult, maxDepthResult);
    }

    @Test
    public void testMaximumDepthBinaryTreeThreeNodes() {
        TreeNode treeNode = new TreeNode(7);
        treeNode.left = new TreeNode(7);
        treeNode.left.left = new TreeNode(5);
        treeNode.right = new TreeNode(6);
        int maxDepthResult = maximumDepthBinaryTree.maxDepthRecursion(treeNode);
        int expectedResult = 3;
        assertEquals(expectedResult, maxDepthResult);
    }
}
