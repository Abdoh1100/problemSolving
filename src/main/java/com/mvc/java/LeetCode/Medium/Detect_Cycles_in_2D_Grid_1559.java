package com.mvc.java.LeetCode.Medium;

import java.util.Arrays;
import java.util.Stack;

public class Detect_Cycles_in_2D_Grid_1559 {

    public boolean solution(int[][]graph){
        //we know the representation of the graph as two d adjacency list so
        // we gonna have a list of visited booleans for each node
        //we gonna have to record the parent of the current node so that if we found
        //a visited node that is not a parent then there is a cycle in an undirected graph
        //update we gonna have another list for the parent of each node!!

        // still needs to revise

        boolean[] visited = new boolean[graph.length];
        int[] parent = new int[graph.length];

        Arrays.fill(parent, -1);

        for (int start = 0; start < graph.length; start++) {
            if (visited[start]) continue;

            Stack<Integer> stack = new Stack<>();
            stack.push(start);
            visited[start] = true;
            while (!stack.isEmpty()) {
                int current = stack.pop();
                for (int neighbor : graph[current]) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        parent[neighbor] = current;
                        stack.push(neighbor);
                    } else if (neighbor != parent[current]) {
                        return true;
                    }
                }
            }
        }
        return false;

    }
    public static void main(String[]args){
        Detect_Cycles_in_2D_Grid_1559 obj = new Detect_Cycles_in_2D_Grid_1559();

        // Graph 1: Has a cycle
        //
        // 0 -- 1
        // |    |
        // 2 -- 3
        //
        int[][] graphWithCycle = {
                {1, 2},     // neighbors of 0
                {0, 3},     // neighbors of 1
                {0, 3},     // neighbors of 2
                {1, 2}      // neighbors of 3
        };

        boolean result1 = obj.solution(graphWithCycle);
        System.out.println("Graph with cycle: " + result1); // true


        // Graph 2: No cycle
        //
        // 0 -- 1 -- 3
        // |
        // 2
        //
        int[][] graphWithoutCycle = {
                {1, 2},     // neighbors of 0
                {0, 3},     // neighbors of 1
                {0},        // neighbors of 2
                {1}         // neighbors of 3
        };

        boolean result2 = obj.solution(graphWithoutCycle);
        System.out.println("Graph without cycle: " + result2); // false
    }
}
