package com.mvc.LeetCode.Easy;

public class vowelsRevers345 {

    public static String reverseVowels(String s) {
        char[]arr=s.toCharArray();
        int pointer1=0;
        int pointer2=arr.length-1;

        while(pointer2>pointer1){

            if(isVowel(arr[pointer1])){
                if(isVowel(arr[pointer2])){

                    char temp= arr[pointer1];
                    arr[pointer1]=arr[pointer2];
                    arr[pointer2]=temp;
                    System.out.println("here : "+arr[pointer1]);
                    pointer2--;
                    pointer1++;
                }else{
                    pointer2--;

                }
            }else {
                if(isVowel(arr[pointer2])){
                    pointer1++;
                }else{
                    pointer1++;
                    pointer2--;
                }
            }
        }
        StringBuilder res=new StringBuilder();
        for(char a:arr){
            res.append(a);
        }
        return res.toString();
    }

    public static boolean isVowel(char a){
        a=Character.toLowerCase(a);
        return switch (a) {

            case 'i', 'u', 'a', 'o','e' -> true;
            default -> false;
        };

    }
    public static void main(String args[]){

//        System.out.println(isVowel('f'));
        System.out.println(reverseVowels("leetcode"));
    }
    }

