package com.leetcode.tasks;

import java.util.*;
//Дана строка и натуральное число k.
//Требуется найти длину максимальной подстроки, содержащей не более k различных символов.

//"acabababa", k = 2
//answer = 7 ("abababa")

//"abccbababacacab", k = 2
//bababa

public class TaskY {


    String getLetters(String str, int k) {
        String[] arr = str.split("");
        Map<Integer, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int keyCounter = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = j; i < arr.length; i++) {
                String value = arr[i];
                int listSize = list.size();
                if (listSize < k) {
                    list.add(value);
                } else {
                    Set<String> set = new HashSet<>(list);
                    if (set.size() < k) {
                        list.add(value);
                    } else if (set.size() == k && set.contains(value)) {
                        list.add(value);
                    } else {
                        if (keyCounter < listSize) {
                            map.put(listSize, getString(list));
                            keyCounter = listSize;
                        }
                        list.clear();
                    }
                }
                //очистка для конца массива
                if (i == arr.length - 1) {
                    if (keyCounter < listSize) {
                        map.put(listSize, getString(list));
                        keyCounter = listSize;
                    }
                    list.clear();
                }
            }
        }
        int maxKey = map.keySet().stream().max(Integer::compare).get();
        return map.get(maxKey);
    }

    String getString(List<String> list) {
        return String.join("", list);
    }
}
