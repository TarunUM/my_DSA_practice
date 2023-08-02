package Leetcode.DP;
public class HouseRobber {
    public static void main(String[] args) {
        int[] houses = {2,1,1,2};
        System.out.println(rob(houses));
    }

    // ********************* IMPORTANT *****************
    // MOST OF THE DP QUESTION ARE BUILT UPON THIS PROBLEM's BASIS
    public static int rob(int[] houses) {
        int rob1 = 0, rob2=0;

        for (int n: houses) {
            // Either My Current Sum is maximum or my prev position [i-1] Sum is max
            int temp = Math.max(n+ rob1, rob2);
            rob1 =rob2;
            rob2 = temp;
        }
        // At the end of the loop rob2 contains the whole max sum of the array
        return rob2;
    }
}
