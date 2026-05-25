package com.uv.practice_java.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1 ,3, 2, 3, 4, 5);
//        list.add(10); // UnsupportedOperationException because Arrays.asList returns a fixed-size list

        List<Integer> list2 = new ArrayList<>(List.of(3, 4, 4));
        list2.add(2);

        list2.stream().collect(Collectors.toSet()).forEach(System.out::println);


        Queue<Integer> queue = new ArrayDeque<>(List.of(4,5,3,2,5));
//        Queue<Integer> queue = new LinkedList<>(List.of(4,5,3,2,5));
        queue.stream().forEach(System.out::println);

        Set<Integer> set = new HashSet<>(List.of(1, 2,3,4,3,4,5));
        System.out.println(set.stream()
                .collect(Collectors.toSet()));

        Set<Integer> set2 = new HashSet<>(Set.of(1, 2,3,4,5));
        System.out.println(set2.stream()
                .collect(Collectors.toSet()));

        HashMap<String,Integer> map = new HashMap<>(Map.of("ram",10,"vaibhav",20,"shyam",30));
       map.forEach((k,v) ->{
               System.out.println(k + " : " + v);
       });

       map.entrySet().stream().forEach(entry -> {
           System.out.println(entry.getKey() + " : " + entry.getValue());
       });
    }
}
