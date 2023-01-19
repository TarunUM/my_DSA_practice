package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackTrackMain {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] paths = new int[board.length][board[0].length];

        backTrackAllPaths("", board, 0, 0, paths, 1);
    }

    static void backTrack(String p, boolean[][] maze,int rows, int cols){
        if(rows == maze.length -1 && cols == maze[0].length -1){
            System.out.println(p);
            return;
        }

        if(!maze[rows][cols]){
            return;
        }

        // Changing The block false because we have mark visited so to remove repeatation
        maze[rows][cols] = false;

        if(rows < maze.length -1 ){
            backTrack( p+"D",maze,rows + 1, cols);
        }

        if(cols < maze[0].length -1){
            backTrack( p+"R",maze, rows, cols+1);
        }

        if(rows > 0 ){
            backTrack( p+"U",maze,rows - 1, cols);
        }

        if(cols > 0){
            backTrack( p+"L",maze, rows, cols - 1);
        }

        // Changing it back to original maze so that it doesn't affect the other paths
        maze[rows][cols] = true;
    }

    static void backTrackAllPaths(String p, boolean[][] maze,int rows, int cols, int[][] paths, int step){
        if(rows == maze.length -1 && cols == maze[0].length -1){
            paths[rows][cols] = step;
            for (int[] arr : paths){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[rows][cols]){
            return;
        }

        // Changing The block false because we have mark visited so to remove repeatation
        maze[rows][cols] = false;
        paths[rows][cols] = step;

        if(rows < maze.length -1 ){
            backTrackAllPaths( p+"D",maze,rows + 1, cols , paths ,step+1);
        }

        if(cols < maze[0].length -1){
            backTrackAllPaths( p+"R",maze, rows, cols+1 , paths ,step+1);
        }

        if(rows > 0 ){
            backTrackAllPaths( p+"U",maze,rows - 1, cols , paths ,step+1);
        }

        if(cols > 0){
            backTrackAllPaths( p+"L",maze, rows, cols - 1 , paths ,step+1);
        }

        // Changing it back to original maze so that it doesn't affect the other paths
        maze[rows][cols] = true;
        paths[rows][cols] = 0;
    }

}
