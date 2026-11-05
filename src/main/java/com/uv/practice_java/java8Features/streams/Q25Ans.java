// 25. Count the occurrences of each element in a list using Java streams
package com.uv.practice_java.java8Features.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q25Ans {
    public static void main(String[] args) {
        List<String> list = List.of("ram", "sham", "kedar", "dai", "sai", "ram", "sham");
        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(collect);

        Map<String, Long> collect2 = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("another approach " + collect2);
    }
}
