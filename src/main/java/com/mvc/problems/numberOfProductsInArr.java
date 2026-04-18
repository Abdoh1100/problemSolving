package com.mvc.problems;

import java.util.HashSet;

public class numberOfProductsInArr {

    public static int solution(int[]a){

        //to make the values unique add them into a hashSet
        //you can as well have easy access using the hashing feature

        HashSet<Integer> values=new HashSet<>();
        for(int num:a){
            values.add(num);

        }

        return values.size();
    }

    public static void main(String []args){
        int a[]={5,6,6,4};
        //if was not in a hashset you would get a wrong answer so
        //uniqueness is important.
        System.out.println(solution(a));
    }
}
