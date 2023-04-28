package com.jacobdgraham.leetcode.Easy;

public class Sqrt_x_ {
    public int mySqrt(int x) {
        // A square root is getting the inverse of an exponent. We are searching for the square root
        // of a number given a wide range of values. Therefore, we will use binary search from 1 to 
        // our target number. 
        // The square root of a number is when the value when multipled by itself gives the
        // origin square root number. 
        if (x == 0 || x == 1) {
            return x;
        }
        int lower_bound = 1;
        int upper_bound = x/2;
        int middle_loop_value = 0;
        int division_result = 0;
        
        while (lower_bound < upper_bound) {
            middle_loop_value = ((lower_bound + upper_bound) / 2) + 1;
            
            division_result = x / middle_loop_value;
            
            if (division_result == middle_loop_value) {
                return middle_loop_value;
            }
            if (division_result > middle_loop_value) {
                lower_bound = middle_loop_value;
            }
            if (division_result < middle_loop_value) {
                upper_bound = middle_loop_value - 1;
            }
        }
        return lower_bound;
    }
}