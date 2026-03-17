package com.mvc.problems;

public  class Capitalize {
// cap the first letter in every word.
    public String cap(String s){

        String []a=s.split(" ");
        for(int i=0;i<a.length;i++){
            String letter=a[i].charAt(0)+"";
            letter= letter.toUpperCase();
            String theRest=a[i].substring(1);
            a[i]=letter+theRest;
        }

        StringBuilder res=new StringBuilder();
        for(String index:a){
            res.append(index).append(" ");
        }

        return res.toString();
    }


}

class main{

    public static void main(String []args){

        Capitalize o=new Capitalize();
        String s="my name is Abdo";
        String res=o.cap(s);
        System.out.println(res);
    }
        }

