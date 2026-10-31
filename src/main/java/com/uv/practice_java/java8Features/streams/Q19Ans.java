// Find the first non-empty string from a list of strings?
package com.uv.practice_java.java8Features.streams;

import java.util.Arrays;
import java.util.List;

public class Q19Ans {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("","Ram", "Aai","", "Avinash", "vikram", "Ajay");
        String result = list.stream()
                .filter(s -> !s.isEmpty())
                .findFirst()
                .orElse("Not Found");
        System.out.println(result);

        list.stream()
                .filter(s -> !s.isEmpty())
                .findFirst()
                .ifPresent(System.out::println);
    }
}
