package com.jacobdgraham.leetcode.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestRemoveDuplicatesFromSortedArray {
    private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    public void testRemoveDuplicatesFromSortedArrayHashSetReturns5() {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicatesFromSortedArray.removeDuplicatesWithHashSet(nums);
        assertEquals(5, result);
    }

    @Test
    public void testRemoveDuplicatesFromArrayReturns2() {
        int nums[] = {1,1,2};
        int result = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(2, result);
    }
}
