package com.leetcode.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * Example 1:
 * <p>
 * Input: s = "hello"
 * Output: "holle"
 */
public class Task5 {
    public String reverseVowels(String s) {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        List<Character> vowels = new ArrayList<>();
        List<Integer> position = new ArrayList<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char letter = charArray[i];
            if (list.contains(letter)) {
                vowels.add(letter);
                position.add(i);
            }
        }
        Collections.reverse(vowels);
        for (int i = 0; i < position.size(); i++) {
            charArray[position.get(i)] = vowels.get(i);
        }
        return new String(charArray);
    }
}

