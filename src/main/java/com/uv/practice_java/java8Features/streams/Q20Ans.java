// Find the second highest number from a list of integers using streams?
package com.uv.practice_java.java8Features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q20Ans {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 10, 11, 2, 3, 4, 5, 12, 13, 6, 7, 14, 8, 9);
        list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
