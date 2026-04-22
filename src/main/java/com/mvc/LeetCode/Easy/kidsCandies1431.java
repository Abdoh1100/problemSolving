package com.mvc.LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;
//Description:
//There are n kids with candies. You are given an integer array candies,
// where each candies[i] represents the number of candies the ith kid has,
// and an integer extraCandies, denoting the number of extra candies that you have.
//Return a boolean array result of length n, where result[i] is true if
// , after giving the ith kid all the extraCandies,
// they will have the greatest number of candies among all the kids, or false otherwise.
//Note that multiple kids can have the greatest number of candies.
public class kidsCandies1431 {

    public static List<Boolean> solution(int []candies,int extra){

        // first step lets get the max so that later we can just check if after adding the extra
        // the value still did not exceed the max then it should be a falsy kid
        int max=0;
        for(int n:candies){
            if(n>max)
                max=n;
        }
        //now we just need to fill the result list after checking if the value after the addition is max or less to use true
        //or false accordingly;
        List<Boolean> res=new ArrayList<>();
        for(int a:candies){
            if(a+extra>=max){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
    public static void main(String[]args){

        List<Boolean> test=new ArrayList<>();
        test=solution(new int[]{2, 3, 5, 1, 3},3);
        System.out.println(test);

    }
}
