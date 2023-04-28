package com.jacobdgraham.leetcode.Easy;

public class SearchInsertPosition {
    
    public int searchInsert(int[] nums, int target) {
        // Since the array is sorted ascendingly (default), we can use a binary search to look for 
        // the target element. 
        // We will not search for the target index by subtracting one from the middle array value because this may return an ArrayIndexOutOfRange exception
        int left_bound = 0;
        int right_bound = nums.length - 1;
        int middle_array_value;
        int target_index = -1;
        
        while (left_bound <= right_bound) {
            middle_array_value = (left_bound + right_bound) / 2;
            
            if (nums[middle_array_value] < target) {
                left_bound = middle_array_value + 1;
                target_index = middle_array_value + 1;
            }
            if (nums[middle_array_value] > target) {
                right_bound = middle_array_value - 1;
                target_index = middle_array_value;
            }
            if (nums[middle_array_value] == target) {
                target_index = middle_array_value;
                break;
            }
        }
        return target_index;
    }
}
