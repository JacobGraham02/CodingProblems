package com.jacobdgraham.leetcode.Easy;

public class RemoveDuplicatesFromSortedList {
    
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public ListNode deleteDuplicates(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }
        
    ListNode nodeListTraversalHead = head;
           
    while (nodeListTraversalHead.next != null) {
        if (nodeListTraversalHead.val == nodeListTraversalHead.next.val) {
            nodeListTraversalHead.next = nodeListTraversalHead.next.next;
        } else {
            nodeListTraversalHead = nodeListTraversalHead.next;
        }
    }
    return head;
}
}

