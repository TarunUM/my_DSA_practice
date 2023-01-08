package Leet.DP;public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins,amount));
    }

    public static int coinChange(int[] coins, int amount) {
        int minvalue = amount+1;
        int[] dp = new int[amount+1];

        //assigning each array element to amount + 1
        for (int i = 1; i < amount+1; i++) {
            dp[i] = amount+1;
        }

        //0th target needs 0 steps
        dp[0] = 0;

        for (int i = 1; i < amount+1; i++) {
            for (int coin: coins) {
                if (i-coin >= 0){
                    dp[i] = Math.min(dp[i], 1 + dp[i-coin]);
                }
            }
        }
        if(dp[amount] != amount+1){
            return dp[amount];
        }
        return -1;

        // TIme complexity is O(amount * len(coins)) & Space Auxiliary Complexity = O(Amount)
    }
}
