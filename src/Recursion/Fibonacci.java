package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
        int ans = fibo(5);
        System.out.println(ans);
    }

    static int fibo(int n) {
        if(n<2){
            return n;
        }
        return fibo(n-1)+ fibo(n-2);
    }
}
