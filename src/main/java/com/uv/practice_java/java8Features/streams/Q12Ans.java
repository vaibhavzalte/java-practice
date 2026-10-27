//sum of squares of even numbers in list
package com.uv.practice_java.java8Features.streams;

import java.util.Comparator;
import java.util.List;

public class Q12Ans {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(avg);
    }
}
