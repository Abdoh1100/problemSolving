package com.mvc.codeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class groupAnagrams {

    public static List<List<String>> groupAnagramsMethod(String[] strs){

        List<List<String>> res=new ArrayList<>();

        List<String> strsList = new ArrayList<>(Arrays.asList(strs));
        for(int i=0;i<strsList.size();i++){
            List<String> elements=new ArrayList<>();
            elements.add(strsList.get(i));
            for(int j=i+1;j<strsList.size();j++){
                if(helper(strsList.get(i),strsList.get(j))){
                        elements.add(strsList.get(j));
                        strsList.remove(strsList.get(j));
                        j--;

                }

            }

            res.add(elements);
        }


        //first lets sort the strings inside the input


        return res;
    }
    public static boolean helper(String s1,String s2){
        s1=s1.toLowerCase();
        s1=s1.trim();
        char [] arr1=s1.toCharArray();
        Arrays.sort(arr1);
        s1=new String(arr1);
        s2=s2.toLowerCase();
        s2=s2.trim();
        char [] arr2=s2.toCharArray();
        Arrays.sort(arr2);
        s2=new String(arr2);

        return s1.equals(s2);
    }
    public static void main (String []args){
        List<List<String>>res=new ArrayList<>();
        res=groupAnagramsMethod(new String []{"x"});
        System.out.println(res);


    }
}
