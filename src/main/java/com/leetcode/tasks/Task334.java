package com.leetcode.tasks;

public class Task334 {
    public boolean increasingTriplet(int[] nums) {
        boolean result = false;
        for(int i=0; i<=nums.length-3;i++){
            if(nums[i]<nums[i+1]&&nums[i+1]<nums[i+2]) {
                result=true;
            }
        }
        return result;
    }
}
