package com.uv.practice_java.interviewQuestions.string;

public class ReverseWordInString {
    public static void main(String[] args) {
        String str = "Hello World from Java";
        String reversed = reverseWords(str);
        System.out.println("Reversed string: " + reversed);
    }
    public static String reverseWords(String str){
        String [] arr = str.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            ans.append(arr[arr.length-1-i]);
            if(i!=0) ans.append(" ");
        }
        return ans.toString();
    }
}
