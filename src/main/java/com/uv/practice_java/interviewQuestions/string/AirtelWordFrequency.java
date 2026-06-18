// you have a list of strings . without using  any built-in sorting method find the top 2 most frequently occurring words
package com.uv.practice_java.interviewQuestions.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AirtelWordFrequency {
    public static void main(String[] args) {
        List<String> words = List.of("hello", "world", "hello", "java", "java", "java");
            List<String> topKFrequent = new AirtelWordFrequency().topKFrequent(words.toArray(new String[0]), 2);
            System.out.println(topKFrequent);
    }
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new java.util.ArrayList<>();
        Map<String,Integer> map = new TreeMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        };
        List<Map.Entry<String,Integer>> list = new java.util.ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue().compareTo(a.getValue()));
        for(int i=0;i<k;i++){
            result.add(list.get(i).getKey());
        }
        return result;
    }
}
