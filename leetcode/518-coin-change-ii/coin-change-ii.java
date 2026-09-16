class Solution {
    public int change(int amount, int[] coins) {
        
        int n = coins.length;

        int dp[][] = new int[coins.length + 1][amount+1];

        for(int d[] : dp)Arrays.fill(d , -1);
 
        if(ways(0 , amount , coins , n , dp) == Integer.MAX_VALUE)return 0;
        return ways(0 , amount , coins , n , dp);
    }

    public int ways(int i , int amount , int[] coins , int n ,int[][] dp){
        if(i == n){
            if(amount == 0)return 1;
            else return Integer.MAX_VALUE;
        }

        if(amount == 0)return 1;

        if(dp[i][amount] != -1)return dp[i][amount];

        int skip = ways(i + 1 , amount , coins , n , dp);

        if(amount < coins[i])return dp[i][amount] = skip;

        int pick = ways(i , amount - coins[i] , coins , n , dp);

        if(skip == Integer.MAX_VALUE)return dp[i][amount] = pick;
        else if(pick == Integer.MAX_VALUE)return dp[i][amount] = skip;
        else return dp[i][amount] = skip + pick;
    }
}