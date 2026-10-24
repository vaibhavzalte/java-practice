package com.uv.practice_java.java8Features.streams;

import java.util.List;

public class Q6Ans {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 32, 5, 11, 2, 3, 6, 6, 9, 3, 44);
        long count = list.stream()
                .filter(n -> n > 5) // 32,11,44
                .count();
        System.out.println(count);
    }

}
