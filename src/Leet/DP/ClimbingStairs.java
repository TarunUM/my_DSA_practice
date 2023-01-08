package Leet;
//https://leetcode.com/problems/climbing-stairs/description/
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
    public static int climbStairs(int n) {
        // Bottom-IP Approach
        int one_step = 1;
        int two_step = 1;

        // Since we already have two steps ways we have to iterate  n-2 time n loop
        // Which gives us sum of prev two elements i.e. ways to climb from that position
        for (int i = 0; i < n-1; i++) {
            int temp = one_step;
            one_step = one_step + two_step;
            two_step = temp;
        }
        return one_step;
    }
}
