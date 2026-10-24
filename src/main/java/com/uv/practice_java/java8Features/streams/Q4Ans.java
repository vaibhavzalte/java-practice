package com.uv.practice_java.java8Features.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Q4Ans {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 5, 2, 3, 6, 6, 9, 3, 44);

        List<Integer> list2 = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(list2);

        List<Integer> list3 = list.stream()
                .map(n -> (n % 2 == 0) ? n * n : n)
                .collect(Collectors.toList());
        System.out.println("other number as it is \n" + list3);

        List<Integer> list4 = list.stream()
                .map(n -> {
                    if (n % 2 == 0) return n * n;
                    else return n;
                })
                .collect(Collectors.toList());
        System.out.println(list4);
    }

}
