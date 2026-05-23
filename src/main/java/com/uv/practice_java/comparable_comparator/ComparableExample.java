package com.uv.practice_java.comparable_comparator;

import java.util.Arrays;

class Student implements Comparable<Student>{
    private int age;
    private String name;

    Student(int age,String name)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age,o.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}
public class ComparableExample {
    public static void main(String[] args) {
        Student s1 = new Student(20,"John");
        Student s2 = new Student(18,"ram");
        Student s3 = new Student(21,"shaym");
            Student[] students = {s1,s2,s3};
        System.out.println("Before sorting"+ Arrays.toString(students));
            Arrays.sort(students);
        System.out.println("After sorting"+ Arrays.toString(students));
    }
}
