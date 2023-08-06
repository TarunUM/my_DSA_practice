package Leetcode;

public class LongestPalindromicSubstring {

    // TODO : Time Complexity is Big-O(N^3)
    public static String longestPalindrome(String s) {
        int length = s.length();
        if (length == 0){
            return s;
        }
        String ans = "";
        for (int i=0; i<length; i++){
            StringBuilder str = new StringBuilder();
            for (int j=i;j<length;j++){
                str.append(s.charAt(j));
                if (isPalindrome(String.valueOf(str)) && ans.length() < str.length()){
                    ans = String.valueOf(str);
                }
            }
        }
        return ans;
    }

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if (s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));

    }
}
