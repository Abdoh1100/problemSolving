package com.mvc.LeetCode.Easy;

public class GcdOfStrings {

    public static String solution(String s1,String s2){
       // first step we want check if the strings share the same pattern how ?
       // add them and check if they are equal
       if(!(s1+s2).equals(s2+s1))
           return "";
       int g=gcd(s1.length(),s2.length());
       // now the result should be the prefix of length gcd
        return s1.substring(0,g);
    }
    private static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    public static void main(String[]args){

        System.out.println(solution("aaaaaaaaaa","a"));
    }
}
