package com.jacobdgraham.leetcode.Easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder binary_string_result_sb = new StringBuilder();
        
        // We are looping backwards in both strings
        int a_counter = a.length() - 1;
        int b_counter = b.length() - 1;
        
        
        // When we add two '1' digits together, we must carry the 1 and append a 0 to the string. 
        int number_carry_value = 0;
        
        while (a_counter >= 0 || b_counter >= 0) {
            // Initialize the sum variable for the 2 digits we are looking at
            int sum = number_carry_value;
            // Calculate the sum of the two digits we are looking at. 
            if (a_counter >= 0) sum += a.charAt(a_counter) - '0'; // Subtract a 0 character to get integer ASCII value 
            if (b_counter >= 0) sum += b.charAt(b_counter) - '0'; 
            // If we end up adding two 1's, we have to sum them to 0 and carry the 1. 
            binary_string_result_sb.append(sum % 2);
            // If we end up in a situation where we add a '1' and '1', this is where the 1 will be carried.
            number_carry_value = sum / 2;
            
            a_counter--;
            b_counter--;
        }
        
        if (number_carry_value != 0) {
            binary_string_result_sb.append(number_carry_value);
        }
        return binary_string_result_sb.reverse().toString();
    }
}
