class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m+1][n+1];

        for(int [] d : dp)Arrays.fill(d , -1);

        return lcs(text1 , m , text2 , n , dp);
    }

    public int lcs(String s1, int m , String s2 , int n ,int[][] dp){
        if(m <= 0 || n <= 0)return 0;

        if(dp[m][n] != -1)return dp[m][n];

        if(s1.charAt(m-1) == s2.charAt(n-1)) return dp[m][n] =  1 + lcs(s1 , m-1 , s2 , n-1 , dp);

        return dp[m][n] = Math.max(lcs(s1 , m-1 , s2 , n , dp) , lcs(s1 , m , s2 , n-1 , dp));
    }
}