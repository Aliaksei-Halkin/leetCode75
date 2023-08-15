package com.leetcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task151Test {
private final Task151 task151 =new Task151();
    @Test
    void when_reverseWords_thenPass() {

       Assertions.assertEquals( task151.reverseWords("the sky is blue"), "blue is sky the");
    }
}