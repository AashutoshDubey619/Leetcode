class Solution {
    public int longestPalindromeSubseq(String s) {

        int n = s.length();

        int[][] dp = new int[n+1][n+1];

        for(int d[] : dp)Arrays.fill(d , -1);

        StringBuilder sb = new StringBuilder(s);

        sb.reverse();

        return lcs(s , n , sb , n , dp);
    }

    public int lcs(String s1 , int m , StringBuilder s2 , int n , int[][] dp){
        if(m == 0 || n == 0)return 0;

        if(dp[m][n] != -1)return dp[m][n];

        if(s1.charAt(m-1) == s2.charAt(n-1))return dp[m][n] = 1 + lcs(s1 , m-1, s2 , n-1 , dp);

        return dp[m][n] = Math.max(lcs(s1 , m , s2 , n-1 , dp) , lcs(s1 , m-1 , s2 , n , dp));
    }
}