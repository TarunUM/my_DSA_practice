package Leetcode.linkedlist;

public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = squareNumber(slow);
            fast = squareNumber(squareNumber(fast));
        } while (slow != fast);
        if(slow == 1) {
            return true;
        }
        return false;
    }

    public int squareNumber(int n){
        int total = 0;
        while (n>0){
            total += (n%10) * (n%10);
            n /= 10;
        }
        return total;
    }
}
