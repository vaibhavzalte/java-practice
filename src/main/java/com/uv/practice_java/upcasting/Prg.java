package com.uv.practice_java.upcasting;
class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    }
    int a=10;
}
class Cocroach extends Animal{
    int a=20;
    public void fly(){
        System.out.println("cocroach is flying");
    }
    public void sound(){
        System.out.println("cocoracch Sound");
    }

}
public class Prg {
    public static void main(String[] args) {
        Animal a = new Cocroach();
        a.sound();
        System.out.println(a.a);
    }
}
