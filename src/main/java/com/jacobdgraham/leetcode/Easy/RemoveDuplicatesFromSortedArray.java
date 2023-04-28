package com.jacobdgraham.leetcode.Easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    
    public int removeDuplicates(int[] nums) {
        int array_counter = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[array_counter] = nums[i];
            array_counter++;
        }
        return array_counter;
    }
    
    public int removeDuplicatesWithHashSet(int[] nums) {
        int array_counter = 0;
        
        Set<Integer> hashSetArrayNumbers = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (hashSetArrayNumbers.add(nums[i])) {
                nums[array_counter] = nums[i];
                array_counter++;
            }
        }
        return array_counter;
    }
}
