// Calculate the average age of a list of Person objects using Java streams
package com.uv.practice_java.java8Features.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
class Person {
    private String name;
    private int age;
}

public class Q22Ans {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 35)
        );
        people.stream()
                .mapToInt(Person::getAge)
                .average()
                .ifPresent(avg -> System.out.println("Average age: " + avg));
    }
}