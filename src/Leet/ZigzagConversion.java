package Leet;
//https://leetcode.com/problems/zigzag-conversion/
public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        String ans = convert(s, 4);
        System.out.println(ans);
        System.out.println(ans.length() + " " +  s.length());
    }

    public static String convert(String s, int numRows) {
        StringBuilder ans = new StringBuilder();
        int stringLength = s.length();
        if(numRows > 1) {
            char[][] matrix = new char[numRows][stringLength] ;

            int row = 0;
            int col = 0;
            int i = 0;

            for(row = 0; row < numRows; row++) {
                for(col = 0 ; col < matrix[row].length; col++) {
                    matrix[row][col] = ' ';
                }
            }
            row = 0;
            col = 0;
            while (i < s.length()) {
                while (i < stringLength && row < numRows) {
                    matrix[row][col] = s.charAt(i);
                    row++;
                    i++;
                }
                row--;
                while (i < stringLength && row > 0 ) {
                    matrix[row-1][col+1] = s.charAt(i);
                    col++;
                    row--;
                    i++;
                }
                row++;
            }

            for(row = 0; row < numRows; row++) {
                for(col = 0 ; col < matrix[row].length; col++) {
                    if(matrix[row][col] != ' ') {
                        ans.append(matrix[row][col]);
                    }
                }
            }

            return ans.toString();
        } else {
            return s;
        }
    }
}

/*
    1 - 1
    2 - 2
    3 - 3
    4 - 5
    5 - 7
    7 - 11
*/