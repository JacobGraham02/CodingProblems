package com.jacobdgraham.leetcode.Easy;

/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1_tail_counter = m - 1;
        int nums2_tail_counter = n - 1;
        int finished_nums1_counter = m + n - 1;
        
        while (nums1_tail_counter >= 0 && nums2_tail_counter >= 0) {
            if (nums1[nums1_tail_counter] > nums2[nums2_tail_counter]) {
                nums1[finished_nums1_counter] = nums1[nums1_tail_counter]; 
                nums1_tail_counter--;
            } else {
                nums1[finished_nums1_counter] = nums2[nums2_tail_counter];
                nums2_tail_counter--;
            }
            finished_nums1_counter--;
        }
        // While loop for 2nd array to detect if there are still numbers left in the 2nd array
        while (nums2_tail_counter >= 0) {
            nums1[finished_nums1_counter] = nums2[nums2_tail_counter];
            finished_nums1_counter--;
            nums2_tail_counter--;
        }

        return nums1;
    }
}
