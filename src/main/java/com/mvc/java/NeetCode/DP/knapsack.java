package com.mvc.java.NeetCode.DP;

public class knapsack {

    /*
    * You are given n items.

    Each item i has:
    - a weight: weights[i]
    - a value: values[i]

    You are also given a knapsack with maximum capacity W.

    You may choose each item at most once.

    Your goal is to choose a subset of the items such that:
    - the total weight is less than or equal to W
    - the total value is as large as possible

    Return the maximum total value you can get.
    * Input:
    weights = [2, 3, 4, 5]
    values  = [3, 4, 5, 6]
    W = 5

    Output:
    7
    * Choose item 0 and item 1.

    Total weight = 2 + 3 = 5
    Total value  = 3 + 4 = 7
    * */
    public static int solution(int[]values,int [] weights, int capacity,int position){

        //what is our base case ? do we still have capacity ?
        // for the base case we have to check either the bag is full or no items left
        if(position==weights.length||capacity==0){
            return 0;
        }
        // option one we gonna skip the item
        int skip=solution(values,weights,capacity,position+1);
        int take=0;
        if(capacity>=weights[position]){
            take=values[position]+solution(values,weights,capacity-weights[position],position+1);
        }


        return Math.max(skip,take);

    }
    public static void main (String []args){
        int[] values = {1, 4, 5, 7};
        int[] weights = {1, 3, 4, 5};
        int capacity = 7;

        int result = solution(values, weights, capacity, 0);

        System.out.println("Maximum value = " + result);
    }
}