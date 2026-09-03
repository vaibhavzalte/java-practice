package com.uv.practice_java.java8Features;


public class recordsPrg {
    public static void main(String[] args) {
        Student s1 = new Student(2,"ram");
        System.out.println(s1.id());
        System.out.println(s1.name());
    }
}
