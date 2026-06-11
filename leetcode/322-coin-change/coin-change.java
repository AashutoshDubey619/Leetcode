class Solution {
    public int coinChange(int[] coins, int amount) {
        
        long[][] dp = new long[coins.length][amount+1];

        for(long d[] : dp)Arrays.fill(d , -1);

        if(countCoin(0 , coins , amount ,dp)== Integer.MAX_VALUE)return -1;
        return (int)countCoin(0 , coins , amount ,dp);
    }

    public long countCoin(int i , int[] coins , int amount , long[][] dp){
        if(i == coins.length){
            if(amount == 0)return 0;
            return Integer.MAX_VALUE;
        } 

        if(dp[i][amount] != -1)return dp[i][amount];

        long skip = countCoin(i + 1 , coins , amount , dp);

        if(amount - coins[i] < 0)return skip;

        long pick = 1 + countCoin(i , coins , amount - coins[i] , dp);

        return dp[i][amount] = Math.min(pick , skip);
    }
}