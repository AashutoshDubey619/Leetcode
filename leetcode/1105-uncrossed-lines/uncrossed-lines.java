class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;

        int[][] dp = new int[m+1][n+1];

        for(int d[] : dp)Arrays.fill(d , -1);

        return lcs(nums1 , m , nums2 , n ,dp);
    }

    public int lcs(int[] nums1 , int m , int[] nums2 , int n ,int [][] dp){
        if(m == 0 || n == 0)return 0;

        if(dp[m][n] != -1)return dp[m][n];

        if(nums1[m-1] == nums2[n-1])return dp[m][n] = 1 + lcs(nums1 , m-1 , nums2 , n-1 ,dp);

        return dp[m][n] = Math.max(lcs(nums1 , m , nums2 , n-1 ,dp) ,lcs(nums1 , m-1 , nums2 , n ,dp));
    }
}