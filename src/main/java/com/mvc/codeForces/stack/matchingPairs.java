package com.mvc.codeForces.stack;

import java.util.ArrayDeque;

public class matchingPairs {

    public static boolean checkPaires(String s){


        //{([])}
        ArrayDeque<Character> stack=new ArrayDeque<>();
        char[] arr=s.toCharArray();
       //
        if(!((arr.length)%2==0))
            return false;

        for (char c : arr) {
            if (helper(c)) {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    char top = stack.peek();
                    System.out.println(c);
                    if (sameParenthese(top,c)) {
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }

            return stack.isEmpty();


        }
    public static boolean helper(char ch){
        return ch=='{'||ch=='['||ch=='(';

    }
    public static boolean sameParenthese(char ch1,char ch2){
        if(ch1=='(')
            return ch2 == ')';
        if(ch1=='{')
            return ch2=='}';
        if(ch1=='[')
            return ch2==']';
        return false;
    }
    public static void main (String[]args){

        System.out.println(checkPaires("{{[]]}}"));
    }
    }


