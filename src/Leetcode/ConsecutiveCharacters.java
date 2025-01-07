package Leetcode;

public class ConsecutiveCharacters {

    public static int maxPower(String s) {
        // iterating from index 1 to end
        // counter, max
        // change counter to 0 if curr letter is diff than prev and check counter and max values
        // if cur and are prev same then increase the counter by one.

        int counter = 1;
        int max = 1;
        for (int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                counter++;
                max = Math.max(max, counter);
            } else if (s.charAt(i) != s.charAt(i-1)) {
                counter = 1;
            }
        }

        return max;
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        // start iterating from left to right;
        // take mul as 1 and keep multiplying the cur value
        // if the value is 1, then increase the counter by 1 and change the max value accordingly
        // if the value becomes 0 then set the counter to 0 and set the mul = 1

        int max = 0;
        int counter = 0;

        for (int num : nums) {
            if (num == 0) {
                counter = 0;
            } else {
                counter++;
            }
            max = Math.max(counter, max);
        }
        return max;
    }
}
