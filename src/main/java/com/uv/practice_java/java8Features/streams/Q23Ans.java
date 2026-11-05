//  Partition numbers in even and odd list
package com.uv.practice_java.java8Features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q23Ans {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 10, 11, 2, 3, 4, 5, 12, 13, 6, 7, 14, 8, 9);
        Map<Boolean, List<Integer>> map = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("even list"+map.get(true));
        System.out.println("even list"+map.get(false));
    }
}
