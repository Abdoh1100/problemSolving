package com.mvc.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Count_Elements_Greater_Than_Previous_Average {

    public static int respo(List<Integer> list){

        // sol in O(n2)
//        int counter=0;
//        for (int i = 1; i <list.size() ; i++) {
//            int a=list.get(i);
//            int sum=0;
//            if(i>0){
//            for (int j = 0; j < i; j++) {
//                sum+=list.get(j);
//                System.out.println("i: "+i+" sum: "+sum);;
//            }}
//            int avg=i==0?0:sum/i;
//            System.out.println("avg: "+avg+" a: "+a);
//
//            if(avg<a)
//                counter++;
//            System.out.println("counter: "+counter);
//        }
//        return counter;

        //sol in O(n)

        if(list==null||list.isEmpty())
            return 0;
        int counter=0;
        long sumSoFar=list.get(0);
        for (int i = 1; i < list.size(); i++) {
            long current=list.get(i);
            if(current*i>sumSoFar){
                counter++;

            }
            sumSoFar+=current;
        }
        return counter;
    }
    public static void main (String[]args){

        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(200);
        list.add(150);
        list.add(300);

        int a=respo(list);
        System.out.println(a);
    }
}
