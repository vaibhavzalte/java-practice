// Check if all numbers in a list are positive
package com.uv.practice_java.java8Features.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Q16Ans {
    public static void main(String[] args) {
        List<Integer> list = List.of(4,6,-1,2,3);
        List<Integer> list2 = List.of(4,6,4,2,3);
        System.out.println(list.stream().allMatch(n->n>0));
        System.out.println(list2.stream().allMatch(n->n>0));
    }
}
