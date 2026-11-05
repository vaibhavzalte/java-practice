//  Group a list of strings by their length using Java streams
package com.uv.practice_java.java8Features.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q24Ans {
    public static void main(String[] args) {
       List<String> list = List.of("ram","sham","kedar","dai","sai","ram","sham");
        Map<Integer, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }
}
