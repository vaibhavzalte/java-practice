//sum of squares of even numbers in list
package com.uv.practice_java.java8Features.streams;

import java.util.Comparator;
import java.util.List;

public class Q11Ans {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,4,2,3,1,1,2,4,3);
        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList()
                .forEach(System.out::println);
    }
}
