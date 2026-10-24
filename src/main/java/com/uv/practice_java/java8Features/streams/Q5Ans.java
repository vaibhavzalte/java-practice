package com.uv.practice_java.java8Features.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q5Ans {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 32,5,11, 2, 3, 6, 6, 9, 3, 44);
        Optional<Integer> first = list.stream()
                .filter(n -> n > 10) // 32,11,44
                .sorted() // 11,32,44
                .findFirst(); // 11
        if(first.isPresent()){
            System.out.println(first.get());
        }
    }

}
