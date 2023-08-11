package com.leetcode.tasks;

import java.util.concurrent.Callable;

/**
 *For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
 * <p>
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * <p>
 *
 *
 * Example 1:
 * <p>
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * Example 2:
 * <p>
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * Example 3:
 * <p>
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 * <p>
 *
 * Constraints:
 * <p>
 * 1 <= str1.length, str2.length <= 1000
 * str1 and str2 consist of English uppercase letters.
 */
public class Task2 implements Callable<String> {
    private final String word1;
    private final String word2;

    public Task2(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    @Override
    public String call() {
        String result = "";
        if(word1.contains(word2)){
            result=  word1.replaceFirst(word2,"");
        }
        return result;
    }
}
