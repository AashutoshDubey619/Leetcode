class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1)return 0;

        int[][] dp =new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j] == 1)dp[i][j] = 0;
                else dp[i][j] = -1;
            }
        }

       return paths(0 , 0 , m , n , dp , obstacleGrid);
    }

    public int paths(int r , int c , int m , int n , int[][]dp , int[][]obstacleGrid){
        if(r >= m || c>= n) return 0;
        if(r == m -1 && c == n-1)return 1;
        if(dp[r][c] != -1)return dp[r][c];

        return dp[r][c] = paths(r+1,c,m,n,dp,obstacleGrid) + paths(r,c+1,m,n,dp,obstacleGrid);
    }
}