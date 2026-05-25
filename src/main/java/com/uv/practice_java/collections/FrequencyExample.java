package com.uv.practice_java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FrequencyExample {
    public static void main(String[] args) {
        String str ="hello word i am he loe";
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(Character ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
            map.put(ch,1);
            }
        }
        map.forEach((k,v) ->System.out.println(k + " : " + v));
    }
}
