package com.jacobdgraham.leetcode.Easy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestRemoveDuplicatesFromSortedList {
    private static RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;

    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    @BeforeAll
    public static void setUp() {
        removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
    }

    @Test
    void testListDuplicateElementsAreRemoved() {
        ListNode list_node1 = new ListNode(1);
        ListNode list_node2 = new ListNode(1);
        ListNode list_node3 = new ListNode(2);
        ListNode list_node4 = new ListNode(3);
        ListNode list_node5 = new ListNode(3);

    }

    @AfterAll
    public static void tearDown() {
        removeDuplicatesFromSortedList = null;
    }
}
