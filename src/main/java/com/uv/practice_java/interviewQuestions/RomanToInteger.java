package com.uv.practice_java.interviewQuestions;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {

    }

}
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length() && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                ans=ans+(map.get(s.charAt(i+1))-map.get(s.charAt(i)));
            }
            else{
                ans=ans+map.get(s.charAt(i));
            }
        }
        return ans;
    }
}
//Input: s = "MCMXCIV"
//Output: 1994
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.