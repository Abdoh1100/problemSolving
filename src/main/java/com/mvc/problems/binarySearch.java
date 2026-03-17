package com.mvc.problems;

import java.util.Arrays;

public class binarySearch {

        public static int binarySear(int [] numbers,int n){

                int start=0;
                int end=numbers.length;

                for (int i = 0; i < numbers.length; i++) {
                      int mid=(int)(start+end)/2;
                      if(numbers[mid]>n){
                              end=mid;
                      }else{
                            if(numbers[mid]<n){
                                    start=mid;
                            }else{
                                    if(numbers[mid]==n){
                                            return mid;
                                    }
                            }

                      }
                }
                return -1;
        }
        public static int binarySearchRe(int [] numbers, int n,int start,int end) {


                int mid = start+ (end -start)/ 2;
                if(start>end)
                        return -1;
                if (numbers[mid] == n)
                        return mid;
                if (numbers[mid] > n) {
                        return binarySearchRe(numbers, n, start, mid-1);

                }
                return binarySearchRe(numbers, n, mid+1, end);




        }
        public static void main (String args[]){

                int [] test={1,2,3,4,5,6};
//                int res=binarySear(test,4);
                int res=binarySearchRe(test,2,0,5);
                System.out.println(res);
        }
}