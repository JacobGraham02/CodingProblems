package com.jacobdgraham.leetcode.Easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String s_trimmed = s.trim();
        int last_index_of_space = s_trimmed.lastIndexOf(" ") + 1;
        String s_trimmed_substring_after_space = s_trimmed.substring(last_index_of_space);
        return s_trimmed_substring_after_space.length();
    }
}
