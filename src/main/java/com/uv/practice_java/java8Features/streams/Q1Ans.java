package com.uv.practice_java.java8Features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q1Ans {
    public static void main(String[] args) {
//        List -> Stream
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5));
        Stream<Integer> stream = numbers.stream();

//        Array to Stream
        String [] arr = new String[]{"ram","sham","kedar"};
        Stream<String> stream1 = Arrays.stream(arr);

//        Stream Of
        Stream<Integer> integerStream = Stream.of(2, 3, 4, 5);
        Stream<String> ram = Stream.of("ram", "sham");

//        Stream generator
        Stream<Double> limit = Stream.generate(Math::random).limit(4);
        System.out.println(Arrays.toString(limit.toArray()));
    }
}
