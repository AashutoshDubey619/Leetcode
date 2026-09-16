class Solution {
    public int minDistance(String word1, String word2) {
        
        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n+1][m+1];

        for(int d[] : dp)Arrays.fill(d , -1);

        if(n == 0)return m;
        if(m == 0)return n;

        return edit(word1 , n , word2 , m , dp);
    }

    public int edit(String word1 , int n , String word2 , int m ,int[][] dp){
        if(m == 0)return n;
        if(n == 0)return m;

        if(dp[n][m] != -1)return dp[n][m];

        if(word1.charAt(n-1) == word2.charAt(m-1))return dp[n][m] = edit(word1 , n-1 , word2 , m-1 , dp);

        return dp[n][m] = 1 + Math.min(edit(word1,n-1, word2 , m-1 , dp) , Math.min(edit(word1, n-1 , word2 , m , dp) , edit(word1 , n , word2 , m-1 , dp)));
    }
}