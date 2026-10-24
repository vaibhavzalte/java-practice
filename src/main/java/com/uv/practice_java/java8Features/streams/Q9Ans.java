package com.uv.practice_java.java8Features.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Q9Ans {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 4, 3);
        Optional<Integer> num = list.stream()
//                .sorted(Comparator.reverseOrder())
                .sorted((a, b) -> (b - a))
                .findFirst();

        Integer num2 = list.stream()
                .reduce(0, (a, b) -> Math.max(a, b));
        System.out.println("Max number "+num.get());
        System.out.println("Max number "+num2);
    }
}
