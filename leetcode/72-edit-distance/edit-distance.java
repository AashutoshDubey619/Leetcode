class Solution {
    public int minDistance(String word1, String word2) {
        
        int m = word1.length();
        int n = word2.length();

        int[][]dp = new int[m+1][n+1];

        for(int d[] : dp)Arrays.fill(d , -1);

        return min_dist(m , n , word1 , word2,dp);
    }

    public int min_dist(int m , int n ,String word1 , String word2,int[][] dp){
        if(m == 0)return n;
        if(n == 0)return m;

        if(dp[m][n] != -1)return dp[m][n];

        if(word1.charAt(m-1) == word2.charAt(n-1))return dp[m][n] = min_dist(m-1,n-1,word1,word2,dp);

        return dp[m][n] = Math.min(1 + min_dist(m-1,n,word1,word2,dp) , Math.min(1 + min_dist(m-1,n-1,word1,word2,dp) , 1+ min_dist(m,n-1,word1,word2,dp)));
    }
}