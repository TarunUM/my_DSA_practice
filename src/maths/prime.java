package maths;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int number = in.nextInt();
        int number = 40;
        if(isPrime(number)){
            System.out.println("It's A prime Number");
        } else{
            System.out.println("It's not a Prime number");
        }
        for (int i = 0; i < number; i++) {
            if (isPrime(i) && i%2 != 0){
                System.out.println(i + "  "+ isPrime(i));
            }
        }
    }

    private static boolean isPrime(int n) {
        if(n<=1)
            return false;
        int c = 2;
        while(c*c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

//    Seive Eratosthenes
    private static void seive(int n, boolean[] prime){
    }

}
