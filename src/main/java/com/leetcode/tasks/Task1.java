package com.leetcode.tasks;

import java.util.concurrent.Callable;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * <p>
 * Return the merged string.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 * Example 2:
 * <p>
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1:  a   b
 * word2:    p   q   r   s
 * merged: a p b q   r   s
 * Example 3:
 * <p>
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1:  a   b   c   d
 * word2:    p   q
 * merged: a p b q c   d
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= word1.length, word2.length <= 100
 * word1 and word2 consist of lowercase English letters.
 */
public class Task1 implements Callable<String> {
    private final String word1;
    private final String word2;

    public Task1(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    @Override
    public String call() {
        int length1 = word1.length();
        int length2 = word2.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length1; i++) {
            stringBuilder.append(word1.charAt(i));
            if (i < length2) {
                stringBuilder.append(word2.charAt(i));
            }
            if ((i + 1 == length1) && (i + 1 < length2)) {
                stringBuilder.append(word2, i + 1, length2);
            }
        }
        return stringBuilder.toString();
    }
}
