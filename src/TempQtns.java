import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class TempQtns {
    public static void main(String[] args) {
//        System.out.println(decodeAtIndex("leet2code3",10));
//        System.out.println(decodeAtIndex2("ha22",5));
//        System.out.println(decodeAtIndex("a2345678999999999999999",1));
//        System.out.println(decodeAtIndex("a3",1));
//        System.out.println(decodeAtIndex("abc",2));
//        System.out.println(decodeAtIndex("a2b3c4d5e6f7g8h9",10));
//        System.out.println(decodeAtIndex("a2b3c4d5e6f7g8h9",69282));
//        System.out.println(decodeAtIndex2("y959q969u3hb22odq595",222280369));

	    // System.out.println(Arrays.toString(args));
	    // System.out.println(zigzagDecode("PROBLEMSONE",2));

//        try (Scanner sc = new Scanner(System.in)) {
//            int a = sc.nextInt();
//            System.out.println(a);
//            String b = sc.next();
//            System.out.println(b);
//            String s = sc.nextLine();
//            System.out.println(s);
//        }


        Integer a = 1;
        Integer b = 5;
        System.out.println(a.compareTo(b)<0);
    }

    public static String zigzagDecode(String s, int k) {
        // P R O B L E M S O N E
        // 0 1 2 3 4 5 6 7 8 9 10
        // O M E -> 2 6 10 <==> R B E S N -> 1 3 5 7 9 <==> P L O -> 0 4 8
        // res - OMERBESNPLO

        ArrayList<char[]> list = new ArrayList<>();

        int start = 0;
        int StringCounter = 0;
        while(StringCounter < s.length()){
            if (start == k){
                for (int i = 0; i < k-2 && StringCounter < s.length(); i++) {
                    char[] arr = new char[k];
                    arr[--start-1] = s.charAt(StringCounter);
                    list.add(arr);
                    StringCounter++;
                }
                start = 0;
            }
            if (start == 0){
                char[] arr = new char[k];
                for (int i = 0; i < k && StringCounter < s.length(); i++) {
                    arr[i] = s.charAt(StringCounter);
                    StringCounter++;
                    start++;
                }
                list.add(arr);
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = k-1; i >=0; i--) {
            for (char[] chars : list) {
                if (chars[i] != 0) {
                    res.append(chars[i]);
                }
            }            
        }
        return res.toString();
    }

    // 130. https://leetcode.com/problems/surrounded-regions/ (Surrounded Regions)
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        ArrayList<int[]> list = new ArrayList<>();
        list.size();
    }

    public static int findSteps(int n, int[] arr, int k){
        // find the steps in the array where the median of the array is equals to k
        Arrays.sort(arr);

        int steps = 0;
        if (n%2==0){
            int median = arr[n/2]+arr[n/2]+1;
        } else {
            int median = arr[n/2];
        }

        return steps;
    }

    public static String decodeAtIndex2(String s, int k) {
        int prev = 0, temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                temp = prev;
                prev *= (s.charAt(i) - '0');
                if (k <= prev || temp > prev) { // overflow, temp > prev
                    if (k % temp != 0 || temp > prev) k %= temp;
                    else if (k < temp) k = 1;
                    else k = temp;
                    i = -1;
                    prev = 0;
                }
            } else if (k == (++prev))
                return String.valueOf(s.charAt(i));
        }
        return "";
    }

//    880. Decoded String at Index
    public static String decodeAtIndex(String s, int k) {
        StringBuilder string = new StringBuilder(s);
        int counter = 0;
        while(string.length() > counter){
            char currChar = string.charAt(counter);
            if (currChar >= '1' && currChar <= '9'){
                String firstPart = string.substring(0,counter);
                String secondPart = string.substring(counter+1);

                StringBuilder newFirstString = new StringBuilder();
                newFirstString.append(firstPart.repeat((int) currChar - 48));

                if (newFirstString.length() > k-1){
                    return String.valueOf(newFirstString.charAt(k-1));
                }

                string.replace(0, string.length(), newFirstString + secondPart);
                counter += firstPart.length() * ((int) currChar - 49);
            } else {
                counter++;
            }
        }
        return String.valueOf(string.charAt(k-1));
    }
}
