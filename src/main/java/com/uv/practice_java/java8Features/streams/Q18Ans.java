// Flatten a list of lists into a single list using streams?-
package com.uv.practice_java.java8Features.streams;

import java.util.List;

public class Q18Ans {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = List.of(
                List.of(1,2,3),
                List.of(4,5,6),
                List.of(8,9,10)
        );
        List<Integer> flatlist = listOfLists.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(flatlist);
    }
}
