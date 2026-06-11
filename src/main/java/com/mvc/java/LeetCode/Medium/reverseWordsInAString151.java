package com.mvc.java.LeetCode.Medium;

import java.util.Arrays;
import java.util.Stack;

public class reverseWordsInAString151 {
    public static void main(String[]args){

        String s="a good  example";
        //s.trim();// it is going to work why? objects in java are immutable
        //once created can not be changed in the same object so we just change what
        //the variable is pointing to next :

//        System.out.println(s)=
//        System.out.println(Arrays.toString(s.split(" ")));
//        for(String d:s.split(" ")){
//            System.out.print(d);
//        }

        s=s.trim();
        Stack<String> stack=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(String a:s.split("\\s+")){
            stack.push(a);
        }
        System.out.println();
        System.out.println("Stack: "+stack.toString());
//        note that java prints a leading space before the word so to know
//        your word use "["+word+"]" ti know your exact word.
        while(!stack.isEmpty()){
            if(stack.size()>1){
                res.append(stack.pop()).append(" ");
            }else{
                res.append(stack.pop());
            }
        }
        System.out.println(res.toString());
    }

}
