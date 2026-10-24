package com.uv.practice_java.java8Features.streams;

import java.util.List;

public class Q7Ans {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 4, 3);
        Integer sum = list.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
