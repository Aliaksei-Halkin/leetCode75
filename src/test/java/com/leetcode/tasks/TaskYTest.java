package com.leetcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskYTest {

    @Test
    void whenGetLetters_thanShouldPass() {
    TaskY taskY = new TaskY();
        Assertions.assertEquals(taskY.getLetters("abccbababacacab", 2),"bababa");
        Assertions.assertEquals(taskY.getLetters("WabccbababacacabW", 3),"abccbababacacab");
        Assertions.assertEquals(taskY.getLetters("acabababa", 2),"abababa");
    }
}