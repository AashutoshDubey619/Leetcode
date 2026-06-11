class Solution {
    public int minInsertions(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        int n = s.length(); 

        if(s.equals(sb.reverse()))return 0;

        int[][] dp = new int[n+1][n+1];
        
        for(int d[] : dp)Arrays.fill(d , -1);

        return s.length() - lcs(s , n , sb , n , dp);
    }

    public int lcs(String s , int m , StringBuilder sb , int n , int[][] dp){
        if(m == 0 || n == 0)return 0;

        if(dp[m][n] != -1)return dp[m][n];

        if(s.charAt(m-1) == sb.charAt(n-1))return dp[m][n] = 1 + lcs(s , m-1 , sb , n-1 , dp);

        return dp[m][n] = Math.max(lcs(s , m , sb , n-1 , dp) , lcs(s , m-1 , sb , n , dp));
    }
}