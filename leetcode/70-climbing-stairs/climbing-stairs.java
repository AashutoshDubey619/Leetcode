class Solution {
    public int climbStairs(int n) {
        if(n <= 2)return n;

        int [] dp = new int[n+1];

        Arrays.fill(dp , -1);

        return paths(n , dp);
    }

    public int paths(int n ,int[] dp){
        if(n <= 2)return n;

        if(dp[n] != -1)return dp[n];

        return dp[n] = paths(n-1 , dp) + paths(n-2 , dp);
    }
}