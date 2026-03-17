package com.mvc.codeForces.easy_800;

public class wayTooLongWords {

    public static StringBuilder solution(String word){

        StringBuilder res=new StringBuilder();
        res.append(word.charAt(0));
        res.append(count(word.substring(1,word.length()-1)));
        res.append(word.charAt(word.length()-1));
        return res;
    }
    private static int count(String s){
        int counter=0;
        for(char c:s.toCharArray()){
            counter++;
        }
        return counter;
    }
    public static void main(String[]args){

        System.out.println(solution("pneumonoultramicroscopicsilicovolcanoconiosis"));
    }
}
