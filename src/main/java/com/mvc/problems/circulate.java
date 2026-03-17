package com.mvc.problems;

import java.util.ArrayDeque;
import java.util.Arrays;

public class circulate {

    public static ArrayDeque<Integer> circulateMethod(int[]arr,int turns){
        ArrayDeque<Integer> res=new ArrayDeque<>();
        for(int a:arr){
            res.add(a);
        }
        while(turns>0){
            int a1=res.removeFirst();
            res.addLast(a1);
            turns--;
        }
        return res;

    }
    public static int [] rotateLeft(int []arr,int moves){

        int []res=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            res[(i+moves)%arr.length]=arr[i];
        }
        return res;
    }
    public static void main (String []args){

//        System.out.println(circulateMethod(new int[] {1,2,3,4,5},5));
        int res[]=rotateLeft(new int[] {1,2,3,4,5},5);
        for(int a:res){
            System.out.print(a+" ");
        }
    }
}
