package com.uv.practice_java.java8Features;

import java.util.Arrays;

class Shop{
    public void showName(String name){
        System.out.println("helllo "+name);
    }
}
public class MethodRefrenceExample {
    public static void sayHello(String name){
        System.out.println("hello "+ name);
    }

    public static void main(String[] args) {
        String [] str = new String[]{"vaibhav","ram","shame"};
        Arrays.stream(str)
                        .forEach(MethodRefrenceExample::sayHello);
    }
}
