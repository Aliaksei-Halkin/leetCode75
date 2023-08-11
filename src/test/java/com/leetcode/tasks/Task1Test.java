package com.leetcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task1Test {

    @Test
    public void whenCall_thanPass() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Task1 taskA = new Task1("abc", "pqr");
        Future<String> futureA = executorService.submit(taskA);
        Assertions.assertEquals(futureA.get(), "apbqcr");

        Task1 taskB = new Task1("ab", "pqrs");
        Future<String> futureB = executorService.submit(taskB);
        Assertions.assertEquals(futureB.get(), "apbqrs");

        Task1 taskC = new Task1("abcd", "pq");
        Future<String> futureC = executorService.submit(taskC);
        Assertions.assertEquals(futureC.get(), "apbqcd");
    }

}