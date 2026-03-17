package com.mvc.problems.generics;

import java.util.ArrayList;
import java.util.List;

class Locker<S,T>{
    private T element;
    List<S> a=new ArrayList<>();
    public Locker(T param){
        this.element=param;
    }
    public void print(){
        System.out.println(this.element);
    }
public static void main (String []args){

        Locker<String,String> L=new Locker<>("");
        L.print();

}

}
public class generics {


    public static void main (String[]args){



    }
}
