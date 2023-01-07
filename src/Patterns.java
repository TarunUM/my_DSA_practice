import java.util.Scanner;
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class Patterns {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Input : ");
//        int n = input.nextInt();
        pattern20(9);
    }

    static void pattern1(int n){
//        * * * *
//        * * * *
//        * * * *
//        * * * *
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
//        *
//        * *
//        * * *
//        * * * *
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
//        * * * *
//        * * *
//        * *
//        *

//        Approach 1
//        for (int row = 0; row< n; row++){
//            for(int col= 1; col <= n-row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Approach 2
        for (int row = n; row > 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
//        1
//        1 2
//        1 2 3
//        1 2 3 4
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

        for (int row = 1; row < 2*n; row++) {
            int TotalColsInRows = row > n ? (2*n-row) : row;
            for (int col = 1; col <= TotalColsInRows ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
//       *
//      **
//     ***
//    ****
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n-row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
//     ****
//      ***
//       **
//        *
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= row; spaces++) {
                System.out.print(" ");
            }
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
//        *
//       ***
//      *****
//     *******
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row-1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
//        *******
//         *****
//          ***
//           *
        for (int row = n; row > 0; row--) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row-1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
//       *
//      * *
//     * * *
//    * * * *
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
//    * * * *
//     * * *
//      * *
//       *
        for (int row = n; row > 0; row--) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
//      * * * *
//       * * *
//        * *
//         *
//         *
//        * *
//       * * *
//      * * * *
        for (int row = 1; row <= 2*n; row++) {
            int ColsInRows = row > n ? (row-n) : (n - row+1);
            for (int spaces = 0; spaces < n-ColsInRows; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= ColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // InComplete
    static void pattern13(int n){
        for (int row = 1; row <= n; row++) {
            int colsNo = row==n ? 2*n : 1;
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= colsNo; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // InComplete
    static void pattern14(int n){
        for (int row = 1; row <= n; row++) {
            int colsNo = row==1 ? 2*n : 1;
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= colsNo; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // InComplete
    static void pattern15(int n){
        for (int row = 1; row < 2*n; row++) {
            int spacesInCols = row > n ? row-n : n-row;
            for (int spaces = 0; spaces <= spacesInCols; spaces++) {
                System.out.print(" ");
            }
                System.out.print("*");
            spacesInCols = row>n ? row-1 : 2*row-1 ;
            for (int spaces = 0; spaces < spacesInCols; spaces++) {
                System.out.print(" ");
            }
                System.out.print("*");
            System.out.println();
        }
    }

    static void pattern16(int n){
        int coef=1;
        for (int row = 0; row < n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row ; col++) {
                if (col == 0 || row == 0) {
                    coef = 1;
                }else {
                    coef = coef*(row-col+1)/col;
                }
                System.out.print(coef+" ");

            }
            System.out.println();
        }
    }
        
    static void pattern17(int n){
//              1
//            2 1 2
//          3 2 1 2 3
//        4 3 2 1 2 3 4
//          3 2 1 2 3
//            2 1 2
//              1

        for (int row = 1; row < 2*n; row++) {
            int TotalColsInRows = row>n? (2*n-row) : row;
            int NoOfSpaces = n-TotalColsInRows;
            for (int space = 1; space <= NoOfSpaces; space++) {
                System.out.print("  ");
            }
            for (int col = TotalColsInRows; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=TotalColsInRows ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    
    static void pattern18(int n){
//        ********
//        ***  ***
//        **    **
//        *      *
//        *      *
//        **    **
//        ***  ***
//        ********
        for (int row = 1; row <= 2*n; row++) {
            int TotalColsInRows = row>n ? row-n : n-row+1;
            for (int col = 1; col <= TotalColsInRows; col++) {
                System.out.print("*");
            }
            for (int spaces = 1; spaces <= (n-TotalColsInRows)*2; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= TotalColsInRows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern19(int n){
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
        for (int row = 1; row <= 2*n; row++) {
            int TotalColsInRows = row>n ? 2*n-row : row;
            for (int col = 1; col <= TotalColsInRows; col++) {
                System.out.print("*");
            }
            for (int spaces = 1; spaces <= 2*(n-TotalColsInRows); spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= TotalColsInRows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern20(int n){
        for (int row = 1; row <= n; row++) {
            int TotalColsAtRows = (row == 1 || row == n) ? n/2 : 1;
            int SpacesForCols = (row == 1 || row == n) ? 0 : (n/2*2)-2;
            for (int col = 1; col <= TotalColsAtRows; col++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < SpacesForCols; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= TotalColsAtRows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *
        for (int row = 1; row < 2*n; row++) {
            int TotalColsInRows = row > n ? (2*n-row) : row;
            int NoOfSpaces = n-TotalColsInRows;
            for (int space = 1; space <= NoOfSpaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= TotalColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
//              1
//            2 1 2
//          3 2 1 2 3
//        4 3 2 1 2 3 4
        for (int row = 1; row < n; row++) {

            for (int space = 1; space <= n-row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4
        for (int row = 1; row < 2*n; row++) {
            for (int col = 1; col < 2*n; col++) {
                int valueAtIndex = n - Math.min(Math.min(row,col),Math.min((2*n - col),(2*n - row))) +1 ;
                System.out.print(valueAtIndex + " ");
            }
            System.out.println();
        }
    }

}
