// Find department with the highest average salary
package com.uv.practice_java.java8Features.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q29Ans {
    public static void main(String[] args) {
        List<Emp> employees = List.of(
                new Emp("Alice", 5000, "IT"),
                new Emp("Bob", 6000, "IT"),
                new Emp("Charlie", 7000, "HR"),
                new Emp("David", 8000, "HR"),
                new Emp("Ram", 8000, "HR"),
                new Emp("Sham", 8000, "Testing"),
                new Emp("Kedar", 8000, "Testing"),
                new Emp("vishal", 8000, "Testing"),
                new Emp("sai", 8000, "Testing")
        );

        Map.Entry<String, Double> stringDoubleEntry = employees.stream()
                .collect(Collectors.groupingBy(Emp::getDepartment, Collectors.averagingInt(Emp::getSalary)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(stringDoubleEntry);
    }
}
