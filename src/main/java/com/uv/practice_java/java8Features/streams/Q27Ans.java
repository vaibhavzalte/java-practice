// Find the highest-paid employee in each department
package com.uv.practice_java.java8Features.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q27Ans {
    public static void main(String[] args) {
        List<Emp> employees = List.of(
            new Emp("Alice", 5000, "IT"),
            new Emp("Bob", 6000, "IT"),
            new Emp("Charlie", 7000, "HR"),
            new Emp("David", 8000, "HR")
        );

        Map<String, Optional<Emp>> collect = employees.stream()
                .collect(Collectors.groupingBy(Emp::getDepartment, Collectors.maxBy(Comparator.comparingInt(Emp::getSalary))));
        System.out.println(collect);
    }
}
