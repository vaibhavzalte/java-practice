package com.uv.practice_java.imp_consept;

import java.util.Arrays;

public class ArrayClone {
    public static void main(String[] args) {
        String [] str = new String[]{new String("hi"),new String("bye")};
        String [] str2 = str.clone();
        str2[0]="ram";
        System.out.println(Arrays.toString(str));

        String [] primitive = new String[]{"hi","bye"};
        String [] primitive2=primitive.clone();
        primitive2[0]="kedar";
        System.out.println(Arrays.toString(primitive));

        int[] arr = {1, 2, 3};
        int[] arr2 = arr.clone();

        arr2[0] = 100;

        System.out.println(Arrays.toString(arr));
    }
}
