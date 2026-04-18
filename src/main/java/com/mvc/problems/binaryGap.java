package com.mvc.problems;

public class binaryGap {


    public static int solution(int n){

        String s=Integer.toBinaryString(n);
        boolean counting = false;
        int currentGap=0;
        int maxGap=0;
        System.out.println(s);
        for(char c:s.toCharArray()){
            if(c=='1'){
                //10001

                if(counting) {
                    maxGap = Math.max(currentGap, maxGap);
                }
                    counting=true;
                    currentGap=0;
                }else if (counting){
                    currentGap++;
                }
            }

        return maxGap ;
    }
    public static void main(String []args){

        int max=solution(12121);
        System.out.println(max);
    }
}
