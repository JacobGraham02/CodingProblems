package com.jacobdgraham.leetcode.Easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestIsSameTree {
    IsSameTree isSameTreeInstance;

    @BeforeEach
    void setUp() {
        isSameTreeInstance = new IsSameTree();
    }

    @Test
    void testSameTreeIfTreeNullRecursiveMethod() {
        IsSameTree.TreeNode treeNodeLeft = null;
        IsSameTree.TreeNode treeNodeRight = null;
        boolean result = isSameTreeInstance.isSameTreeRecursion(treeNodeLeft, treeNodeRight);
        assertTrue(result);
    }

    @Test
    void testDifferentTreeIfOneNullIterativeMethod() {
        IsSameTree.TreeNode treeNodeLeft = null;
        IsSameTree.TreeNode treeNodeRight = new IsSameTree.TreeNode(1);
        boolean result = isSameTreeInstance.isSameTreeIterative(treeNodeLeft, treeNodeRight);
        assertFalse(result);
    }

    @AfterEach
    void tearDown() {
        isSameTreeInstance = null;
    }
}
