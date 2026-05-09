package com.mvc.java.LeetCode.Medium;

import java.util.Arrays;
import java.util.Stack;

public class Detect_Cycles_in_2D_Grid_1559 {

    public boolean solution(char[][]graph){
        // problem statement: Given a 2D array of
        // characters grid of size m x n, you need to
        // find if there exists any cycle consisting of
        // the same value in grid.
        //A cycle is a path of length 4 or more in the
        // grid that starts and ends at the same cell.
        // From a given cell, you can move to one of
        // the cells adjacent to it - in one of the four
        // directions (up, down, left, or right), if it has
        // the same value of the current cell.
        //Also, you cannot move to the cell that you visited
        // in your last move. For example,
        // the cycle (1, 1) -> (1, 2) -> (1, 1) is invalid
        // because from (1, 2) we visited (1, 1) which was the last visited cell.
        //Return true if any cycle of the same value exists in grid,
        // otherwise, return false.

/*
* 1. Treat every cell in the grid as a node in an undirected graph.

2. Each node can move only:
   - up
   - down
   - left
   - right

3. A move is valid only if:
   - the neighbor is inside the grid
   - the neighbor has the same character

4. Create a visited matrix to remember explored cells.

5. Loop through every cell in the grid.

6. If a cell was already visited:
   - skip it

7. Otherwise:
   - start a DFS from this cell
   - push:
       current row
       current col
       parent row
       parent col

8. While DFS is running:
   - pop the current cell
   - check all 4 directions

9. For every neighbor:
   - ignore if outside grid
   - ignore if different character

10. If the neighbor is exactly the parent cell:
    - ignore it
    - because going backward is not a cycle

11. If the neighbor was already visited
    AND it is not the parent:
    - cycle found
    - return true

12. Otherwise:
    - mark neighbor visited
    - push neighbor into stack
    - store current cell as its parent

13. If all DFS traversals finish without finding a cycle:
    - return false


Main idea:

Visited same-character neighbor that is not the parent = cycle
*
*
* */

        boolean visited[][]=new boolean[graph.length][graph[0].length];


        //stack(sr,sc,pi,pj)
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[0].length;j++){

                if(visited[i][j])continue;

                // Each stack item stores:
                // {currentRow, currentCol, parentRow, parentCol}
                Stack<int[]> stack = new Stack<>();
                visited[i][j]=true;
                stack.push(new int[]{i,j,-1,-1});

                while(!stack.isEmpty()){
                    int [] current= stack.pop();
                    int row=current[0];
                    int col=current[1];
                    for(int d=0;d<4;d++){
                        // for the four directions
                        int nextRow=row+dr[d];
                        int nextCol=col+dc[d];

                        //check if outbound cell
                        if (nextRow < 0 || nextCol < 0 ||
                                nextRow >= graph.length || nextCol >= graph[0].length) {
                            continue;
                        }

                        //has to be the same and the cell is not a parent and visited as well
                        if(graph[nextRow][nextCol]!=graph[row][col])
                            continue;


                        // now check if the cell is visited and is a parent
                        if (nextRow == current[2] && nextCol == current[3]) {
                            continue;
                        }

                        //now check if it is not then it is a cycle
                        if (visited[nextRow][nextCol]) {
                            return true;
                        }

                        visited[nextRow][nextCol]=true;
                        stack.push(new int[]{nextRow,nextCol,row,col});
                    }
                }
            }
        }


        return false;
//
    }
    public static boolean dfs(char[][]graph){


        return false;

    }
    public static void main(String[]args){
        Detect_Cycles_in_2D_Grid_1559 obj = new Detect_Cycles_in_2D_Grid_1559();

    }
}
