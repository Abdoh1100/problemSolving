package com.mvc.NeetCode;

import java.util.Stack;

public class validParentheses {

    public static boolean solution(String s){

        Stack<Character> st=new Stack<>();
        // first we gonna go through the array of chars
        //whenever we encounter an open bracket or ... we push the closing one similar to it
        // and if we encounter a closing one we check if equal then we are good otherwise it is not valid

        for(char c:s.toCharArray()){
            if(c=='{'){
                st.push('}');
            }else if(c=='('){
                st.push(')');
            }else if(c=='['){
                st.push(']');
            }
            else if(st.isEmpty()||st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[]args){

        System.out.println(solution("[({)]"));
    }
}
