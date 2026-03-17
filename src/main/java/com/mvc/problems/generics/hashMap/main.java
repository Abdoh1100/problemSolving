package com.mvc.problems.generics.hashMap;

public class main {

    public static void main(String[]args){

        Pair<String, Integer> pair = new Pair<>("one", 1);
        System.out.println(pair.getKey() + " -> " + pair.getValue());
    }
}
