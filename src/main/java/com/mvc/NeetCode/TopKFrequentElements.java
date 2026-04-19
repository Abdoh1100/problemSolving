package com.mvc.NeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {

    public static int[] solution(int []numbers, int k){

        HashMap<Integer,Integer> values=new HashMap<>();
        //now we need to fill it with the freq of each number
        for(int n:numbers){
            values.put(n,values.getOrDefault(n,0)+1);
            // a simple shortcut for the if else that checks if the item is there
            // we say that try to get n if not then return a zero and
            // anyway add one to it bingo
        }

        //the light trick here that will save us time is to use Buckets
        // we gonna use the buckets for the freq as the index
        // so we at most wanna have the length of the n array and
        // traversing it would be at most O(n)
        //the buckets are array of lists so :
        List<Integer>[] buckets=new List[numbers.length+1];
        for(int key:values.keySet()){
            int freq=values.get(key);
            if(buckets[freq]==null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }
        //we filled the buckets so now we gonna create the result array

        int [] res=new int [k];
        int index=0;
        for(int i=buckets.length-1;i>=0&&k>index;i--){
            if(buckets[i]!=null){
                for(int val:buckets[i]){
                    res[index++]=val;
                    if(index==k)
                        return res;
                }
            }
        }
        return res;
    }

    public static void main(String []args){


    }
}
