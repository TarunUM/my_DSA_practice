package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=1824, ans = RevNo(n);
        int rev = 0;
        while(n>0){
            rev = rev*10 + (n%10);
            n=n/10;
        }
        System.out.println(ans);
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
