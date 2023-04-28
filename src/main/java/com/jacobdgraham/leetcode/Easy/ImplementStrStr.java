package com.jacobdgraham.leetcode.Easy;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) {
            return 0;
        }
        if (needle.isEmpty()) {
            return 0;
        }
        
        int needle_counter = 0;
        int haystack_counter = 0;
        
        // If needle_counter == needle.length, break out of loop
        // Once a character in needle and haystack are the same, begin incrementing the needle counter
        // If at any time a character in the haystack string does not equal one in the needle string,
        // reset the needle counter and skip over the number of characters that needle consisted of
        // in haystack.
        // Subtracting the needle_counter from haystack_counter will get the starting
        // character index of needle. 
        // Always increment haystack_counter to eventually break out of the while loop
        while (haystack_counter < haystack.length()) {
            if (needle_counter == needle.length()) {
                break;
            }
            if (needle.charAt(needle_counter) == haystack.charAt(haystack_counter)) {
                needle_counter++;
            } else if (needle.charAt(needle_counter) != haystack.charAt(haystack_counter)) {
                haystack_counter = haystack_counter - needle_counter;
                needle_counter = 0;
            }
            haystack_counter++;
        }
        
        return (needle_counter == needle.length()) ? haystack_counter - needle_counter : -1;
    }
}
