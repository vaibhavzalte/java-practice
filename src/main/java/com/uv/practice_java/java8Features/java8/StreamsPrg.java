package com.uv.practice_java.java8Features.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPrg {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 5, 7, 3, 2, 1, 40, 4, 5));

        list.stream()
                .filter(n -> n < 30)
                .peek(n -> System.out.println(n))
                .forEach(n -> System.out.println("terminal operation" + n));

        List<Integer> collect = list.stream()
                .map(n -> n + 1)
                .peek(System.out::println)
                .sorted(Integer::compare)
                .distinct()
                .limit(6)
                .skip(2)
                .toList();

        System.out.println(collect);


        List<List<Integer>> lists = new ArrayList<>(List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6)
        ));
        System.out.println(lists);
        List<Integer> list1 = lists.stream()
                .flatMap(n -> n.stream())
                .toList();
        System.out.println(list1);

        List<Integer> l3 = new ArrayList<>(List.of(1, 2, 4, 3, 2, 3));
        Integer ans = l3.stream()
                .peek(System.out::println)
                .reduce(0, (a, b) -> a + b);
        System.out.println(ans);
    }



/*
Notes
Stream does NOT process one operation completely and then move to the next operation
Stream processes each element through the entire pipeline, one element at a time
*/

}
