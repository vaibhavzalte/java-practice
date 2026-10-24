//sum of squares of even numbers in list
package com.uv.practice_java.java8Features.streams;

import java.util.List;
import java.util.Optional;

public class Q10Ans {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 4, 3);
        Integer sum = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n->n*n)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
