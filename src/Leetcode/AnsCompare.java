package Leetcode;

public class AnsCompare {
    public static void main(String[] args) {

        String myAns = "[[\".Q..\"\"...Q\"\"Q...\"\"..Q.\"][\"..Q.\"\"Q...\"\"...Q\"\".Q..\"]]";

        String leetAns = "[[\".Q..\",\"...Q\",\"Q...\",\"..Q.\"],[\"..Q.\",\"Q...\",\"...Q\",\".Q..\"]]\n";

        System.out.println(leetAns.equals(myAns));
    }
}
