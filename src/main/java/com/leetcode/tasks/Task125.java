package com.leetcode.tasks;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise
 * Example 1:
 * <p>
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome
 */
public class Task125 {

    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("\\p{Punct}|\\s+", "");
        int length = s1.length();
        s1=s1.toUpperCase();
        boolean result = true;
        for (int i = 0; i < length / 2; i++) {
            if (s1.charAt(i)!= (s1.charAt(length-1 - i))) {
                result = false;
                break;
            }
        }
        return result;
    }

}
