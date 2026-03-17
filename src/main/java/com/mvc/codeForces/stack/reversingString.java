package com.mvc.codeForces.stack;

import java.util.ArrayDeque;

public class reversingString {

    public static StringBuilder stringReverse(String str){

        // we just put it in the stack and then building it back from the stack
        ArrayDeque<Character> stack=new ArrayDeque<>();
        char[] arr=str.toCharArray();
        for(char ch : arr){
            stack.push(ch);
        }
        StringBuilder result=new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());

        }

        return result;
    }
    public static void main(String []args){

        System.out.println(stringReverse("abcd"));
    }
}
