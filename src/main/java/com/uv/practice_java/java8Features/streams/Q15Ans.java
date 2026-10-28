// Join all strings from a list with a delimiter like ','
package com.uv.practice_java.java8Features.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Q15Ans {
    public static void main(String[] args) {
        List<String> list = List.of("Ram","Aai","Avinash","vikram","Ajay");
        String collect = list.stream().
                collect(Collectors.joining(","));
        System.out.println(collect);
        String collect1 = list.stream()
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect1);
    }
}
