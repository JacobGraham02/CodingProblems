package com.jacobdgraham.leetcode.Easy;

public class PlusOne {
    
    public int[] plusOne(int[] digits) {
        /*
        If we have a 9 digit in our array, we must create a new array that is one larger than
        the current array. Else, we increment the right-most digit in the array by one.
        */
        int length_of_digits_array = digits.length;
        
        for (int i = length_of_digits_array - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int new_digits_array[] = new int[length_of_digits_array + 1];
        new_digits_array[0] = 1;
        
        return new_digits_array;
    }
}
