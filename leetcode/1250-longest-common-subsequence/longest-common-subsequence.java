class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int[][] dp = new int[text1.length()+1][text2.length()+1];

        for(int d[] : dp)Arrays.fill(d , -1);

        return lcs(text1, text1.length(),text2, text2.length() , dp);
    }

    public int lcs(String text1, int m, String text2, int n , int[][] dp) {
        if(m == 0 || n == 0)return 0;

        if(dp[m][n] != -1)return dp[m][n];

        if(text1.charAt(m-1) == text2.charAt(n-1)) return dp[m][n] = 1 + lcs(text1, m-1, text2, n-1 , dp);

        return dp[m][n] = Math.max(lcs(text1, m-1, text2, n , dp),lcs(text1, m, text2, n-1 , dp));
    }
}