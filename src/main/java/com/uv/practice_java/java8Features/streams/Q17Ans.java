// Check if any number in a list is divisible by 5?
package com.uv.practice_java.java8Features.streams;

import java.util.List;

public class Q17Ans {
    public static void main(String[] args) {
        List<Integer> list = List.of(4,6,-1,2,3);
        List<Integer> list2 = List.of(4,6,4,25,2,3);
        System.out.println(list.stream().anyMatch(n->n%5==0));
        System.out.println(list2.stream().anyMatch(n->n%5==0));
    }
}
