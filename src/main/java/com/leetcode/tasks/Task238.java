package com.leetcode.tasks;

import java.util.Arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 */
public class Task238 {
    public int[] productExceptSelf(int[] nums) {
        int[] resultArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            nums[i] = 1;
            int asInt = Arrays.stream(nums).parallel().reduce((acc, x) -> acc * x).getAsInt();
            nums[i] = num;
            resultArray[i] = asInt;
        }
        return resultArray;
    }
}
