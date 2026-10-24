package com.uv.practice_java.java8Features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q2Ans {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 5, 2, 3, 6, 6, 9, 3, 44);
        List<Integer> eventList = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(eventList);
    }
}
