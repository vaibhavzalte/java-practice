package com.uv.practice_java.java8Features;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> nums =Arrays.asList(10,20,3,40,50,20,60,70,80);
        // FILTER
        System.out.println("Even Numbers:");
        nums.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);

//        or
        System.out.println(nums.stream()
                .filter(n->n%2==0).collect(Collectors.toList()));

        System.out.println("\nSquare Values:");
        System.out.println(nums.stream()
                .map(n->n*n).collect(Collectors.toList()));


        System.out.println("\nSum of each number");
        System.out.println(nums.stream()
                .reduce(Integer::sum).get());

        // DISTINCT
        System.out.println("\nDistinct:");
        System.out.println(nums.stream()
                .distinct().collect(Collectors.toList()));

        // SORTED
        System.out.println("\nSorted Desc:");
        System.out.println(nums.stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
//        OR
        // SORTED
        System.out.println("\nSorted Desc:");
        System.out.println(nums.stream()
                .sorted((a,b)->b-a).collect(Collectors.toList()));

        // LIMIT
        System.out.println("\nLimit:");
        System.out.println(nums.stream()
                .limit(3).collect(Collectors.toList()));

        // skip
        System.out.println("\nskip first 3:");
        System.out.println(nums.stream()
                .skip(3).collect(Collectors.toList()));
        // count
        System.out.println("\ncount ");
        System.out.println(nums.stream()
                .count());

        // min
        System.out.println("\nmin ");
        System.out.println(nums.stream()
                .min((a,b)->a-b).get());

// or
        System.out.println(nums.stream().min(Integer::compare).get());
        System.out.println(nums.stream().max(Integer::compare).get());

        // findFirst
        Integer first = nums.stream()
                .findFirst()
                .get();

        System.out.println("First = " + first);

        // anyMatch
        boolean check = nums.stream()
                .anyMatch(n -> n > 70);

        System.out.println(check);


        // allMatch
        boolean all = nums.stream()
                .allMatch(n -> n > 5);

        System.out.println(all);


        // noneMatch
        boolean none = nums.stream()
                .noneMatch(n -> n < 0);

        System.out.println(none);
    }
}
