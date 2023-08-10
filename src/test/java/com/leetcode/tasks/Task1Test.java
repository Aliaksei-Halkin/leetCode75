package com.leetcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    public void whenCall_thanPass() {
        Assertions.assertEquals(new Task1("abc", "pqr").call(), "apbqcr");
        Assertions.assertEquals(new Task1("ab", "pqrs").call(), "apbqrs");
        Assertions.assertEquals(new Task1("abcd", "pq").call(), "apbqcd");
    }

}