package com.leetcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task125Test {

    @Test
    void whenCalculate_thanShouldPass() {
        String s = "A man, a plan, a canal: Panama";
        Assertions.assertTrue(new Task125().isPalindrome(s));
        Assertions.assertFalse(new Task125().isPalindrome("dfwc"));
    }

}