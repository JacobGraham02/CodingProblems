package com.jacobdgraham.leetcode.Easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSymmetricTree {
    private SymmetricTree symmetricTree;

    @BeforeEach
    void setUp() {
        symmetricTree = new SymmetricTree();
    }

    @Test
    void testSymmetryOnNullTree() {
        SymmetricTree.TreeNode treeNode = null;
        boolean expected_answer = symmetricTree.isSymmetric(treeNode);
        assertTrue(expected_answer);
    }

    @Test
    void testSymmetryOnRandomSymmetricTree() {
        SymmetricTree.TreeNode treeNode = new SymmetricTree.TreeNode(1,new SymmetricTree.TreeNode(2),
                new SymmetricTree.TreeNode(2));
        boolean expected_answer = symmetricTree.isSymmetric(treeNode);
        assertTrue(expected_answer);
    }

    @Test
    void testNoSymmetryOnTree() {
        SymmetricTree.TreeNode treeNode = new SymmetricTree.TreeNode(1, new SymmetricTree.TreeNode(3),
                new SymmetricTree.TreeNode(-1));
        boolean expected_answer = symmetricTree.isSymmetric(treeNode);
        assertFalse(expected_answer);
    }

    @AfterEach
    void tearDown() {
        symmetricTree = null;
    }
}
