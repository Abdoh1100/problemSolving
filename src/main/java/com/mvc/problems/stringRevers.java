package com.mvc.problems;

public class stringRevers {


//    static StringBuilder stringRev(String s,int index,StringBuilder res){
//
//        if(index==0)
//            return res;
//        res.append(s.charAt(index-1));
//        return stringRev(s,index-1,res);
//
//    }
    static StringBuilder stringRev(String s){
        StringBuilder res=new StringBuilder(s.length());

        for (int i = s.length(); i>0  ; i--) {
            res.append(s.charAt(i-1));
        }
        return res;
    }
    public static void main(String[]args){

        System.out.println(stringRev("hmda"));
    }
}
