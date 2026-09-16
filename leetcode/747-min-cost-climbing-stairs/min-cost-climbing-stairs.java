class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;

        int[] dp = new int[n+1];

        Arrays.fill(dp , -1);

        return Math.min(mincost(0 , n , cost ,dp) , mincost(1 , n , cost ,dp));
    }

    public int mincost(int i , int n ,int[] cost ,int[] dp){
        if(i >= n)return 0;

        if(dp[i] != -1)return dp[i];

        return dp[i] = cost[i] + Math.min(mincost(i + 1 , n , cost ,dp) , mincost(i + 2 , n , cost ,dp));
    }
}