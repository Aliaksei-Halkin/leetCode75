package com.leetcode;

import com.leetcode.tasks.Task1;

public class Main {
    public static void main(String[] args) {
        String call1 = new Task1("abc", "pqr").call();
        System.out.println(call1);
        String call2 = new Task1("ab", "pqrs").call();
        System.out.println(call2);
        String call3 = new Task1("abcd", "pq").call();
        System.out.println(call3);
    }
}