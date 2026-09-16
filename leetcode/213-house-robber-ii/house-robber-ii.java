class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1)return nums[0];

        int n = nums.length;

        int[] dp1 = new int[n+1];
        int[] dp2 = new int[n+1];

        Arrays.fill(dp1 , -1);
        Arrays.fill(dp2 , -1);

        return Math.max(maxRob(0, n-1, nums , dp1) , maxRob(1 , n , nums , dp2));
    }

    public int maxRob(int i , int n , int[] nums ,int[] dp){
        if(i >= n)return 0;

        if(dp[i] != -1)return dp[i];

        int pick = nums[i] + maxRob(i + 2, n , nums , dp);

        int skip = maxRob(i + 1 , n , nums , dp);

        return dp[i] = Math.max(skip , pick);
    }
}