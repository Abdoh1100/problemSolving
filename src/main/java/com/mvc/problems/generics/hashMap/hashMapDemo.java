package com.mvc.problems.generics.hashMap;
import com.mvc.problems.generics.List;

public class hashMapDemo<K,V>{
    private List<Pair<K,V>>[] values;
    private int index;
    public hashMapDemo(Pair<K,V> pair){

        this.values=new List[32];
        this.index=0;
    }
public V get(K key){
 return null ;
}
private boolean found(K key){
//        for(List<Pair<K,V>> p:this.values){
//            for(int i=0;i<p.size();i++){
//                List<Pair<K,V>> pp=[i];
//
//            }
//        }\
    return false;
}
    public void add(Pair<K,V> pair){
//        if(!contains(pair)){
//
//        }
    }
    public boolean contains(List<Pair<K,V>> pair){
        for(List<Pair<K,V>> p:this.values){
            if(p.equals(pair))
                return true;
        }
        return false;
    }
}

