package com.leetcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Task238Test {
    private final Task238 task238 = new Task238();

    @Test
    void productExceptSelf() {
        int[] nums = new int[]{1, 2, 3, 4};
        Assertions.assertEquals(Arrays.toString(task238.productExceptSelf(nums)),
                Arrays.toString(new int[]{24, 12, 8, 6}));
    }
}