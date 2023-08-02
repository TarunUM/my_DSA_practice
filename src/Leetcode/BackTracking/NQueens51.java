package Leetcode.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens51 {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        int n = 5, count = 0;
        List<List<String>> ans = solveNQueens(n);
        for (List<String> each : ans){
            count++;
            System.out.println(each);
        }
        System.out.println(count);
    }

    public static List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        solve(board, 0, ans);
        return ans;
    }

    static void solve(boolean[][] board, int row, List<List<String>> ans){
        if(row == board.length){
            List<String> subAns = display(board);
            ans.add(subAns);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)){
                board[row][col] = true;
                solve(board, row+1, ans);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }

        int maxRight = Math.min(row, board.length-col-1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }

    private static List<String> display(boolean[][] board) {

        List<String> subList = new ArrayList<>();

        for (boolean[] booleans : board) {
            StringBuilder eachRow = new StringBuilder();
            eachRow.append("\"");
            for (boolean ele : booleans) {
                if (ele) {
                    eachRow.append("Q");
                } else {
                    eachRow.append(".");
                }
            }
            eachRow.append("\"");

            subList.add(String.valueOf(eachRow));
        }

        return subList;
    }
}
