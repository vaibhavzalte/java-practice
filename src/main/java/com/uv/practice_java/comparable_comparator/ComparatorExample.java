package com.uv.practice_java.comparable_comparator;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
    public int age;
    public String name;

    Employee(int age,String name)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
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
class sortByName implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
        return e1.name.compareTo(e2.name);
    }
}
class sortByAge implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
        return Integer.compare(e1.age,e2.age);
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        Employee s1 = new Employee(18,"bohn");
        Employee s2 = new Employee(15,"aam");
        Employee s3 = new Employee(2,"shaym");
        Employee[] students = {s1,s2,s3};
        System.out.println("Before sorting"+ Arrays.toString(students));
            Arrays.sort(students,new sortByName());
        System.out.println("After sorting by name"+ Arrays.toString(students));
        Arrays.sort(students,new sortByAge());
        System.out.println("After sorting by age"+ Arrays.toString(students));
    }
}
