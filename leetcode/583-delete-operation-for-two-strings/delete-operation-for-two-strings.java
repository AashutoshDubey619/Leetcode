class Solution {
    public int minDistance(String word1, String word2) {
        
        int m = word1.length();
        int n = word2.length();
        
        int[][] dp = new int[m+1][n+1];

        for(int d[] : dp)Arrays.fill(d , -1);

        int sub = lcs(word1 , m , word2 , n ,dp);

        int steps = 0;

        if(word1.length() > sub)steps += (word1.length() - sub);
        if(word2.length() > sub)steps += (word2.length() - sub);

        return steps;
    }

    public int lcs(String word1 , int m , String word2 , int n ,int[][]dp){
        if(m == 0 || n == 0)return 0;

        if(dp[m][n] != -1)return dp[m][n];

        if(word1.charAt(m-1) == word2.charAt(n-1))return dp[m][n] = 1 + lcs(word1 , m-1 , word2 , n-1 ,dp);

        return dp[m][n] = Math.max(lcs(word1 , m-1 , word2 , n ,dp) , lcs(word1 , m , word2 , n-1 ,dp));
    }
}