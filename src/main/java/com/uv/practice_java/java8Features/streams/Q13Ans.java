package com.uv.practice_java.java8Features.streams;

import java.util.Comparator;
import java.util.List;

public class Q13Ans {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,23,45,13,4,15);
        List<Integer> asc = list.stream()
                .sorted()
                .toList();
        List<Integer> desc = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Original:"+list);
        System.out.println("ASC:"+asc);
        System.out.println("DESC:"+desc);
    }
}
