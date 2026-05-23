package com.uv.practice_java.java8Features;
@FunctionalInterface
interface Add{
    public int operation(int a,int b);
    public default void print(){
        System.out.println("i am default method");
    }
}
public class LambdaExample2 {
    public static void main(String[] args) {
        Add add=(a,b)->a+b;
        System.out.println(add.operation(3,4));
        add.print();
    }
}
