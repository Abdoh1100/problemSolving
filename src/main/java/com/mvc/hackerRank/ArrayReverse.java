package com.mvc.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class ArrayReverse {


//    public static String rev(String s){
//
//        if(s.isEmpty())
//            return "";
//
//        return s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1));
//    }
    public static List<Integer> rev(List<Integer>a){

        if(a.isEmpty())
            return a;
        Integer last =a.removeLast();
        List<Integer> rest=rev(a);
        rest.addFirst(last);

        return rest;
    }
    public static void main (String []args ){
        String s="12345";
        List<Integer>a =new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(rev(a));


    }
}
