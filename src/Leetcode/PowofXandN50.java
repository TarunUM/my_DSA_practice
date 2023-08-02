package Leetcode;

public class PowofXandN50 {
    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
    }

    public static double myPow(double x, int n) {
        if(n == 0){
            return (double) 1;
        }
        double ans = 1;
        if(n < 0){
            n = -n;
            x = 1 / x;
        }

        while(n != 0){
            if((n & 1) != 0){
                ans *= x;
            }

            x *= x;
            n >>>= 1;
            //  n=n>>1;
        }

        return ans;
    }
}
