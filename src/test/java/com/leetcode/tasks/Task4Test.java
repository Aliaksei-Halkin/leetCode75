package com.leetcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task4Test {
    private Task4 task4 = new Task4();

    @Test
    public void whenCanPlaceFlowers_thenPass() {
        int[] arr = new int[]{0,0,1,0,0,0,1};
        Assertions.assertEquals(task4.canPlaceFlowers(arr, 2), true);
    }

}