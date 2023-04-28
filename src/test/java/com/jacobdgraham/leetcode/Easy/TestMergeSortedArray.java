package com.jacobdgraham.leetcode.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestMergeSortedArray {
    private static MergeSortedArray mergeSortedArray;

    @BeforeAll
    public static void setUp() {
        mergeSortedArray = new MergeSortedArray();
    }

    @Test
    void testMergeSortedArrayWithRegularArrays() {
        int nums1[] = {1,2,3,0,0,0};
        int length_of_nums1 = 3;
        int nums2[] = {2,5,6};
        int length_of_nums2 = 3;
        int expected_output[] = {1,2,2,3,5,6};
        String result_of_merge_sorted_array = Arrays.toString(expected_output);
        assertEquals(Arrays.toString(expected_output), result_of_merge_sorted_array);
    }

    @Test
    void testMergeSortedArrayWithOneEmptyArray() {
        int nums1[] = {1};
        int length_of_nums1 = 1;
        int nums2[] = {};
        int length_of_nums2 = 0;
        int expected_output[] = {1};
        String result_of_merge_sorted_array = Arrays.toString(expected_output);
        assertEquals(Arrays.toString(expected_output), result_of_merge_sorted_array);
    }

    @AfterAll
    public static void tearDown() {
        mergeSortedArray = null;
    }
}
