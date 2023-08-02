package Leetcode;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int a=19, b=1, c= 0;
        while(b>0){
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
            c++;
        }
        System.out.println(a + "   " + c);
    }
}
