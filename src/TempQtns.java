import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class TempQtns {
    public static void main(String[] args) {
//        System.out.println(playTheGame(new int[]{2,3}));
//        System.out.println(playTheGame(new int[]{16,17,18}));
//        LocalDate date = LocalDate.of(2019, Month.MARCH, 30);
//        System.out.println("Date "+date);

//        System.out.println(findWinningCombinations(new int[] {1,2,3,9}));
//        System.out.println(findWinningCombinations(new int[] {1,2,2}));

        Scanner sc = new Scanner(System.in);

        int rev = 4865;
        String ans = "";

        int i = 1;
        while(rev > 0){
            int rem = rev % 10;
            if (i==1){
                ans = String.valueOf(((rem * 10 * i)/10));
            } else {
                ans = ((rem * 10 * i)/10) + " + " + ans;
            }
            rev /= 10;
            i *= 10;
        }

        System.out.println(ans);

//        System.out.println("---------------");
//
//        System.out.println(playTheGame(new int[]{1,2,3,9}));
//        System.out.println(playTheGame(new int[]{1,2,2}));
//
//        System.out.println("---------------");
//
//            int N1 = 4;
//        int[] sticks1 = {1, 2, 3, 9};
//        int output1 = countWinningCombinations(N1, sticks1);
//        System.out.println(output1);  // Output: 1
//
//        int N2 = 3;
//        int[] sticks2 = {1, 2, 2};
//        int output2 = countWinningCombinations(N2, sticks2);
//        System.out.println(output2);  // Output: 0
    }

    public static int findWinningCombinations(int[] sticks) {
        // Check if the input array is null or empty.
        if (sticks == null || sticks.length == 0) {
            return 0;
        }

        // Create a hash table to store the number of sticks of each length.
        HashMap<Integer, Integer> hashTable = new HashMap<>();
        for (int stick : sticks) {
            hashTable.put(stick, hashTable.getOrDefault(stick, 0) + 1);
        }

        // Count the number of winning combinations for Raymond.
        int winningCombinations = 0;
        for (int stick : sticks) {
            // Check if the current stick is a duplicate.
            if (hashTable.get(stick) > 1) {
                // If the current stick is a duplicate, we can only use one of them to create a winning combination.
                winningCombinations++;
            } else {
                // If the current stick is not a duplicate, we can use both of them to create winning combinations.
                for (int i = 1; i <= stick / 2; i++) {
                    for (int j = i; j <= stick - i; j++) {
                        if (hashTable.containsKey(i) && hashTable.containsKey(j) && hashTable.containsKey(stick - i - j)) {
                            winningCombinations++;
                        }
                    }
                }
            }

            // Remove the current stick from the hash table.
            hashTable.remove(stick);
        }

        return winningCombinations;
    }


    public static int countWinningCombinations(int N, int[] sticks) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each stick length
        for (int stick : sticks) {
            frequencyMap.put(stick, frequencyMap.getOrDefault(stick, 0) + 1);
        }

        int count = 0;

        // Check for winning combinations
        for (int frequency : frequencyMap.values()) {
            count += frequency * (frequency - 1) / 2;
        }

        return count;
    }

    public static int playTheGame(int[] arr) {
        Hashtable<Integer, Integer> map = new Hashtable<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }

        return max;
    }

}