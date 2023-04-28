package com.jacobdgraham.leetcode.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestSearchInsertPosition {
    private static SearchInsertPosition searchInsertPosition;

    @BeforeAll
    public static void setUp() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    void testResultOneWhereInsertingTwoIntoArray() {
        int nums[] = {1,3,5,6};
        int expected_output = 1;
        int target_number = 2;
        assertEquals(expected_output, searchInsertPosition.searchInsert(nums, target_number));    
    }

    @AfterAll
    public static void tearDown() {
        searchInsertPosition = null;
    }
}
