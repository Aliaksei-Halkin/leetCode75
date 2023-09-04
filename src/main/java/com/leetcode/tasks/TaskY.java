package com.leetcode.tasks;

import java.util.*;
import java.util.stream.Collectors;
//Дана строка и натуральное число k.
//Требуется найти длину максимальной подстроки, содержащей не более k различных символов.

//"acabababa", k = 2
//answer = 7 ("abababa")

//"abccbababacacab", k = 2
//bababa

public class TaskY {


    String getLetters(String str, int k) {
        String[] arr = str.split("");
        Map<Integer, String> map = new HashMap();
        List<String> list = new ArrayList();
        int keyCounter = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = j; i < arr.length; i++) {
                String value = arr[i];
                if (list.size() < 1) {
                    list.add(value);
                } else {
                    Set<String> set = new HashSet(list);
                    if (set.size() <= k) {
                        if(set.contains(value)){
                            list.add(value);
                        }

                        int listSize = list.size();
                        if (keyCounter < listSize) {
                            map.put(listSize, getString(list));
                            keyCounter = listSize;
                            list = new ArrayList();
                            list.add(value);
                        }
                    }
                }
            }
        }
        int maxKey = map.entrySet().stream().map(Map.Entry::getKey).max(Integer::compare).get();
        return map.get(maxKey);
    }

    String getString(List<String> list) {
        return list.stream().collect(Collectors.joining());
    }


}
