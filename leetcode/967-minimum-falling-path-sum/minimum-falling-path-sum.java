class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int n = matrix.length;

        int min_sum = Integer.MAX_VALUE;

        int[][] dp = new int[n+1][n+1];

        for(int d[] : dp)Arrays.fill(d , Integer.MAX_VALUE);

        for(int i=0;i<n;i++){
           min_sum = Math.min(find_sum(0 , i , n , n , matrix, dp) , min_sum);
        }

        return min_sum;
    }

    public int find_sum(int r , int c , int m , int n , int[][] matrix , int[][]dp){
        if(c < 0 || c >= n)return (Integer.MAX_VALUE/2);
        if(r == m-1)return dp[r][c] = matrix[r][c];

        if(dp[r][c] != Integer.MAX_VALUE)return dp[r][c];

        int below = matrix[r][c] + find_sum(r+1 , c , m , n , matrix, dp);
        int ldiag = matrix[r][c] + find_sum(r+1 , c-1 , m , n , matrix, dp);
        int rdiag = matrix[r][c] + find_sum(r+1 , c+1 , m , n , matrix, dp);

        return dp[r][c] = Math.min(below , Math.min(ldiag , rdiag));
    }
}