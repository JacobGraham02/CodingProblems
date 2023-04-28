package com.jacobdgraham.leetcode.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestRemoveElement {
    private static RemoveElement removeElement;

    @BeforeAll
    public static void setUp() {
        removeElement = new RemoveElement();
    }

    @Test
    public void testRemoveAllOccurancesOfElementFromArray() {
        int nums[] = {0,1,2,2,3,0,4,2};
        int integerToRemove = 2;
        int resultArrayAfterRemoving2 = removeElement.removeElement(nums, integerToRemove);
        assertEquals(5, resultArrayAfterRemoving2);
    }

    @AfterAll
    public static void tearDown() {
        removeElement = null;
    }
}
