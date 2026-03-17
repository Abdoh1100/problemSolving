package com.mvc.problems;

import java.util.List;
import java.util.Scanner;

import static java.lang.Math.max;

public class knapsack {

    static Scanner sc=new Scanner(System.in);
    public static int knapsack(int n,int capacity,int[]weights,int[]values){

       if(capacity==0||n==0)
           return 0;
       int take=0;
       if(capacity>=weights[n-1]){
           take=values[n-1]+
                   knapsack(n-1,capacity-weights[n-1],weights,values);
       }
       int dontTake=knapsack(n-1,capacity,weights,values);

       return max(take,dontTake);

    }
    public static void main (String []args){

        int n = 4;
        int W = 7;

        int []weights = {1, 3, 4, 5};
        int []values  = {1, 4, 5, 7};
        System.out.println(knapsack(n,W,weights,values));

    }
}
