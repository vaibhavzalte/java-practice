// # 26. Group a Employees by their department and calculate the average salary for each department using Java streams
package com.uv.practice_java.java8Features.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@AllArgsConstructor
@Data
class Emp {
    String name;
    int salary;
    String department;
}
public class Q26Ans {
    public static void main(String[] args) {
        List<Emp> employees = List.of(
            new Emp("Alice", 5000, "IT"),
            new Emp("Bob", 6000, "IT"),
            new Emp("Charlie", 7000, "HR"),
            new Emp("David", 8000, "HR")
        );

        Map<String, Double> collect = employees.stream()
                .collect(Collectors.groupingBy(Emp::getDepartment, Collectors.averagingDouble(Emp::getSalary)));

        System.out.println(collect);
    }
}
