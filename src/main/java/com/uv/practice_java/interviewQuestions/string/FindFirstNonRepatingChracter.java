package com.uv.practice_java.interviewQuestions.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepatingChracter {
    public static void main(String[] args) {
        String str = "aabbccdeff";
        char result = findFirstNonRepeatingCharacter(str);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    private static char findFirstNonRepeatingCharacter(String str) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch:str.toCharArray())
        {
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
//        for(Map.Entry<Character,Integer> t :map.entrySet()){
//            if(t.getValue()==1) return t.getKey();
//        }
        for(Character ch:map.keySet())
        {
            if(1==map.get(ch)) return ch;
        }
        return '\0';
    }
}
