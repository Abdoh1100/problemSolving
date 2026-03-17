package com.mvc.problems;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class test {

private int a ;

    public test(int a) {
        this.a = a;
    }
    public test(){
        this(0);
    }

    public static double avg(){
        Scanner sc=new Scanner(System.in);

        ArrayList<String> numbers=new ArrayList<>();
        while(true){
            String s=sc.nextLine();
            if(s.equalsIgnoreCase("end"))
                break;
            numbers.add(s);
        }
        if (numbers.isEmpty()) {
            return 0.0;
        }
        return numbers.stream()
                .mapToDouble(Double::parseDouble) // Use Double to handle decimals
                .average()                        // Returns an OptionalDouble
                .orElse(0.0);

    }
    public static int rec(int n){
        if(n==0)
            return 1;
        if(n<0){
            return rec(n+1)*n;
        }
        return rec(n-1)*n;
    }

    public static void main (String [] args){

        int a =4;
        System.out.println(avg());
//        switch(a){
//            case 1:a=1;
//                System.out.println(a); break;
//            case 4:a=2;
//                System.out.println(a);break;
//            default:
//                System.out.println(10);
//
//        }

//        System.out.println(rec(-5));
    }
}
