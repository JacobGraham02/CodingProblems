package com.jacobdgraham.leetcode.Easy;

public class RemoveElement {
    
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        
        int array_counter = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }    
            nums[array_counter] = nums[i];
            array_counter++;
        }
        return array_counter;
    }
}
