package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class MazeProb {
    public static void main(String[] args) {
//        System.out.println(prosWaysDiagonal(3, 3));
//        Diagonal("" ,3,3);

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        List<String> ans = posWaysListRestrictions("", board, 0, 0);

        System.out.println(ans);


    }

    static int prosWays(int rows, int cols){
        if (rows == 1 | cols == 1) {
            return 1;
        }

        int down = prosWays(rows - 1, cols);
        int rigght = prosWays(rows, cols-1);

        return down+rigght;
    }


//    p = Processed
    static void posWaysString(String p, int rows, int cols){
        if(rows == 1 && cols == 1){
            System.out.println(p);
            return;
        }

        if(rows>1){
            posWaysString( p+"D",rows - 1, cols);
        }

        if(cols > 1){
            posWaysString( p+"R", rows, cols-1);
        }
    }

    static int prosWaysDiagonal(int rows, int cols){
        if (rows == 1 || cols == 1) {
            return 1;
        }

        int right=0, down=0, Diagonal = 0;

        right = prosWaysDiagonal(rows, cols-1);
        down = prosWaysDiagonal(rows - 1, cols);
        Diagonal = prosWaysDiagonal(rows-1 , cols -1);

        return down+right+Diagonal;
    }

    static void Diagonal(String p, int rows, int cols){
        if(rows == 1 && cols == 1){
            System.out.println(p);
            return;
        }

        if(rows>1){
            posWaysString( p+"V",rows - 1, cols);
        }

        if(rows>1 && cols > 1){
            posWaysString( p+"D", rows-1, cols-1);
        }

        if(cols > 1){
            posWaysString( p+"H", rows, cols-1);
        }
    }

    static void posWaysStringRestrictions(String p, boolean[][] maze,int rows, int cols){
        if(rows == maze.length -1 && cols == maze[0].length -1){
            System.out.println(p);
            return;
        }

        if(!maze[rows][cols]){
            return;
        }

        if(rows < maze.length -1 ){
            posWaysStringRestrictions( p+"D",maze,rows + 1, cols);
        }

        if(cols < maze[0].length -1){
            posWaysStringRestrictions( p+"R",maze, rows, cols+1);
        }
    }

    static List<String> posWaysListRestrictions(String p, boolean[][] maze,int rows, int cols){
        if(rows == maze.length -1 && cols == maze[0].length -1){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        if(!maze[rows][cols]){
            return new ArrayList<>();
        }

        List<String> ans = new ArrayList<>();

        if(rows < maze.length -1 ){
            List<String> down = posWaysListRestrictions( p+"D",maze,rows + 1, cols);
            ans.addAll(down);
        }

        if(cols < maze[0].length -1){
            List<String> right = posWaysListRestrictions( p+"R",maze, rows, cols+1);
            ans.addAll(right);
        }

        return ans;
    }
}
