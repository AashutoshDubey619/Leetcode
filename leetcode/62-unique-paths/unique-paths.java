class Solution {
    public int uniquePaths(int m, int n) {
        
        int dp[][] = new int[m+1][n+1];

        for(int d[] : dp)Arrays.fill(d , -1);

        return paths(0 , 0 , m , n , dp);
    }

    public int paths(int row , int col , int m , int n ,int[][] dp){
        if(row == m-1 || col == n-1)return 1;

        if(dp[row][col] != -1)return dp[row][col];

        return dp[row][col] = paths(row , col+1 , m , n , dp) + paths(row + 1 , col , m , n , dp);
    }
}