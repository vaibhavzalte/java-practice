// Sort a list of Employee by salary
package com.uv.practice_java.java8Features.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
class Employee {
    private int id;
    private String name;
    private double salary;
}

public class Q21Ans {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "John", 50000),
                new Employee(2, "Alice", 60000),
                new Employee(3, "Bob", 55000)
        );

        employees.stream()
                .sorted((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()))
                .forEach(System.out::println);
        System.out.println("+++++++++++");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .forEach(System.out::println);
    }
}
