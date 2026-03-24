class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for(int i=0;i<m;i++){
            Arrays.fill(dp[i] , -1);
        }

        return pathsum(m-1 , n-1 , grid  , dp );
    }

    public int pathsum(int row , int col , int[][] grid , int[][] dp){
        if(row < 0 || col < 0)return Integer.MAX_VALUE;

        if(row == 0 && col == 0)return grid[0][0];

        if(dp[row][col] != -1)return dp[row][col];

        return dp[row][col] = grid[row][col] + Math.min(pathsum(row-1,col,grid , dp) , pathsum(row , col-1 , grid , dp)); 
    }
}