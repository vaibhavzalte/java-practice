package com.uv.practice_java.java8Features;
@FunctionalInterface
interface Calculator{
    public int operation(int a,int b);
}
public class LambdaExample {
    public static void main(String[] args) {
        Calculator add = (a,b)-> a+b;
        Calculator sub = (a,b)-> a-b;
        System.out.println(add.operation(4,5));
        System.out.println(sub.operation(4,5));
    }
}
