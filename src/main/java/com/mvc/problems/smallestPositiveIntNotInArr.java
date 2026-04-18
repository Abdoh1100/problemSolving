package com.mvc.problems;

import java.util.Arrays;

public class smallestPositiveIntNotInArr {


    public static int solution(int[] A) {
        // Implement your solution here
        boolean positive =false;
        int index=0;
        Arrays.sort(A);
        while(true){
            int current=A[index];
            if(current>0){
                if(!inArr(A,current+1))
                    return current+1;
            }else{
                return 1;
            }
            index++;

        }

    }
    public static boolean inArr(int []arr,int n){

        for(int a : arr){
            if(n==a)
                return true;
        }
        return false;
    }

    public static void main (String[]args){
        int []a={-1,-3};
        System.out.println(solution(a));

    }
}
