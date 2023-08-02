package Leetcode;

public class StringToInteger {
    public static int myAtoi(String s) {
        int i = 0;
        int j = s.length();
        if(j == 0) return 0;
        while(i<j && s.charAt(i) == ' '){
            i++;
        }
        if(i>=j) {
            return 0;
        }

        int pos = 0;
        int neg = 0;

        if(s.charAt(i) == '+'){
            pos++;
            i++;
        }
        if (i<j && s.charAt(i) == '-' ){
            neg++;
            i++;
        }
        if (neg == 1 || pos == 1){
            if (j ==1) {
                return 0;
            }
        }

        if(pos == 1 && neg == 1) {
            return 0;
        }

        double ans = 0;
        while (i<j && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            ans = ans * 10 + (s.charAt(i) - '0');
            i++;
        }
        if (neg == 1){
            ans = -ans;
        }
        if(ans < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        if(ans > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        return (int)ans;
    }

    public static void main(String[] args) {
//        System.out.println(myAtoi("  +  413"));
//        System.out.println(myAtoi("+-21"));
//        System.out.println(myAtoi("-91283472332"));
//        System.out.println(myAtoi("20000000000000000000"));
//        System.out.println(myAtoi("4193with23 words"));
//        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("+"));
        System.out.println(myAtoi(" "));
    }
}
