package com.mvc.problems.generics;

public class List <T>{
    private T [] list;
    private int index;

    public List(){
        this.list=(T [])new Object[10];
        this.index=0;
    }
    public void add(T value){
        if(this.list.length==this.index){
            grow();
        }
        this.list[this.index]=value;
        this.index++;
    }
    private void grow(){
        int newSize=this.list.length+this.list.length/2;
            T[] newValues=(T[])new Object[newSize];
            for(int i=0;i<this.list.length;i++){
                newValues[i]=this.list[i];
            }
            this.list=newValues;
    }
     public int size(){
        return this.index;
     }
}
