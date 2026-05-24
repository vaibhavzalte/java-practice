package com.uv.practice_java.comparable_comparator;

import java.util.Arrays;
import java.util.Comparator;

class Teachers {
     int age;
    String name;

    Teachers(int age,String name)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}
public class UsingLambda {
    public static void main(String[] args) {
        Teachers s1 = new Teachers(20,"John");
        Teachers s2 = new Teachers(18,"ram");
        Teachers s3 = new Teachers(21,"shaym");
        Teachers[] students = {s1,s2,s3};
        System.out.println("Before sorting"+ Arrays.toString(students));
        Arrays.sort(students,(a,b)-> Integer.compare(a.age,b.age));
//        Arrays.sort(students,(a,b)-> a.name.compareTo(b.name));
        System.out.println("After sorting"+ Arrays.toString(students));
    }
}

