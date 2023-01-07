package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        int n=1824281;
        boolean ans = Pdrome(n);
        System.out.println(ans);
    }

    static boolean Pdrome(int n){
        int rev = RevNo(n);
        if( n == rev){
            return true;
        }
        return false;
    }

    static int RevNo(int n) {
        int digitsInN = (int)Math.log10(n);
        return helper(n, digitsInN);
    }

    private static int helper(int n, int digitsInN) {
        if(n%10==n){
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digitsInN) + helper(n/10 , digitsInN-1);
    }
}
