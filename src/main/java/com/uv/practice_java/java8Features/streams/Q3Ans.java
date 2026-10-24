package com.uv.practice_java.java8Features.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Q3Ans {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 5, 2, 3, 6, 6, 9, 3, 44);
//        List<Integer> eventList = list.stream()
//                .map(n->n*n)
//                .collect(Collectors.toList());
        List<Integer> eventList = list.stream()
                .map(n-> (int)Math.pow(n,2))
                .collect(Collectors.toList());
        System.out.println(eventList);
    }
}
