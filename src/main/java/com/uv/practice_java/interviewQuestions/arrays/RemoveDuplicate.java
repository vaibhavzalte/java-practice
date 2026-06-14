package com.uv.practice_java.interviewQuestions.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr = new int[]{4,3,2,4,3,6,0,0,-1,-2,-1,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(removeDuplicate(arr)));
        System.out.println(Arrays.toString(removeDuplicateStream(arr)));
    }

    private static int[] removeDuplicate(int[] arr) {
        Set<Integer> set =new LinkedHashSet<>();
        for(int a:arr) set.add(a);

        int ans [] = new int[set.size()];
        int k=0;
        for (Integer e:set){
            ans[k++]=e;
        }
        return ans;
    }
    private static int[] removeDuplicateStream(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }
}
