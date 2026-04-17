package com.mvc.problems.interviewList;

import com.sun.tools.javac.Main;

import java.util.*;
import java.util.stream.Collectors;

public class BFS {

    static List<List<Integer>> graph=new ArrayList<>();
//    static Map<Integer,List<Integer>> graph=new HashMap<>();
    static
    public record TreeNode(int val,TreeNode left,TreeNode right){}

    public static boolean validBfs(int numberOfNodes, List<List<Integer>> edges,List<Integer> bfs){

        //first we gonna fill out adjacency list with the details
        // each node should have its neighbors only e.g. 1->2,3 and so on

//        for(int i=0;i<map.size();i++){
//            int v=map.get(i).get(0);
//            int u=map.get(i).get(1);
//            if(graph.get(v)==null){
//                ArrayList<Integer> list=new ArrayList<>();
//                list.add(u);
//                graph.put(v,list);
//            }else{
//                graph.get(v).add(u);
//            }
//        }

//        for (int i = 0; i <graph.size() ; i++) {
//            if(graph.get(i)!=null) {
//                System.out.println(i + "->" + graph.get(i)
//                        .stream().map(String::valueOf)
//                        .collect(Collectors.joining(" ")));
//            }
//            }
        for (int i = 0; i <=numberOfNodes; i++) {
            graph.add(new ArrayList<>());

        }
        for (int i = 0; i <edges.size() ; i++) {
            int u=edges.get(i).get(0);
            int v=edges.get(i).get(1);
            graph.get(u).add(v);
            graph.get(v).add(u);

        }
//        Queue<TreeNode> qu=new LinkedList<>();

        for (int i = 0; i <graph.size() ; i++) {
            System.out.println(i+"->"+graph.get(i));
        }


            return true;

    }
    public static void main(String []args){

        int n =4;
        List<List<Integer>> edges=new ArrayList<>();
        edges.add(new ArrayList<>(List.of(1,2)));
        edges.add(new ArrayList<>(List.of(1,3)));
        edges.add(new ArrayList<>(List.of(2,4)));

        validBfs(4,edges,List.of(1,2,3,4));


    }
}
