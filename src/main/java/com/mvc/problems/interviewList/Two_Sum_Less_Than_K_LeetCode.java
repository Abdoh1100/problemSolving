package com.mvc.problems.interviewList;

import java.util.Arrays;

public class Two_Sum_Less_Than_K_LeetCode {

    public static int twoSumLessThanK(int[] nums, int k) {

        int max =-1;
//        for (int i = 0; i <nums.length ; i++) {
//            for (int j = i+1; j <nums.length ; j++) {
//
//                int current=nums[i]+nums[j];
//                if(current>max&&current<k)
//                    max=current;
//            }
//        }

        //this O(n log n) solution.
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int current=nums[left]+nums[right];
            if(current>k){
                right--;
            }else{
                    left++;
                    max=Math.max(max,current);
            }



        }
        return max;
    }

    public static void main (String[]args){

        System.out.println(twoSumLessThanK(new int[]{34,23,1,24,75,33,54,8},60));
    }
}
