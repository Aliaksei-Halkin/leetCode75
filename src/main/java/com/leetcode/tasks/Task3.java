package com.leetcode.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList();
        int asInt = Arrays.stream(candies).max().getAsInt();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+ extraCandies >= asInt) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
