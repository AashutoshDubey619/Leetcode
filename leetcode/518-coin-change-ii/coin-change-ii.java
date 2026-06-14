class Solution {
    public int change(int amount, int[] coins) {
        
       int[][] dp = new int[coins.length][amount+1];

       for(int[] d : dp)Arrays.fill(d , -1);

       return ways(0 , amount , coins , dp);
    }

    public int ways(int i , int amount , int[] coins ,int[][] dp){
        if(i == coins.length){
            if(amount == 0)return 1;
            else return 0;
        }

        if(dp[i][amount] != -1)return dp[i][amount];

        int skip = ways(i+1 , amount , coins , dp);

        if(amount < coins[i])return dp[i][amount] = skip;

        int pick = ways(i , amount - coins[i], coins , dp);

        return dp[i][amount] = skip + pick;
    }
}