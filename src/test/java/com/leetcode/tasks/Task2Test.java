package com.leetcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task2Test {

    @Test
    void whenCall_thanPass() throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Task2 taskA = new Task2("ABCABC", "ABC");
        Future<String>futureA=executorService.submit(taskA);
        Assertions.assertEquals(futureA.get(), "ABC");

        Task2 taskB = new Task2("ABABAB", "ABAB");
        Future<String>futureB=executorService.submit(taskB);
        Assertions.assertEquals(futureB.get(), "AB");

        Task2 taskC = new Task2("LEET", "CODE");
        Future<String>futureC=executorService.submit(taskC);
        Assertions.assertEquals(futureC.get(), "");
    }
}