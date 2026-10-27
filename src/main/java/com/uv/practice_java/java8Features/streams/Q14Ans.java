package com.uv.practice_java.java8Features.streams;

import java.util.Comparator;
import java.util.List;

public class Q14Ans {
    public static void main(String[] args) {
        List<String> list = List.of("","Ram","Aai","Avinash","vikram","Ajay");
        long count = list.stream()
                .filter(n -> n.startsWith("A"))
                .count();
        System.out.println("count"+count);
    }
}
