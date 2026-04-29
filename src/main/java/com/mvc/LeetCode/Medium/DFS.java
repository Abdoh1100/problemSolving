package com.mvc.LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
    class Node{

    }
    public static void solutionDFS(List<List<Integer>> graph,int start,int n){
        // we have a graph that we need to traverse so we need a Stack DS since we gonna do it iteratively
        // BTW we use Queue DS for BFS
        Stack<Integer> stack=new Stack<>();
        //Now we gonna have a list of booleans to track the visited nodes
        stack.push(start);
        boolean visited[]=new boolean[n];
        // we gonna start the loop unless the stack is empty
        System.out.println("DFS: ");
        while(!stack.isEmpty()){
            int node=stack.pop();
            if(visited[node]) continue;
            visited[node]=true;

            System.out.print(node+" ");

            for(int neighbor:graph.get(node)){
                if(!visited[neighbor]){
                    stack.push(neighbor);
                }

            }

        }
        System.out.println();

    }
    public static void main(String[]args){

        int n = 6;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        int[][] edges = {{0,1},{0,2},{1,3},{1,4},{2,5}};
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

//        bfs(adj, 0, n); // BFS: 0 1 2 3 4 5
        solutionDFS(adj, 0, n); // DFS: 0 2 5 1 4 3
    }
}
