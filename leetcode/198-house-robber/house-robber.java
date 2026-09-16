class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;

        int[] dp = new int[n + 1];

        Arrays.fill(dp , -1);

        return maxRob(0 , 0 , n , nums , dp);
    }

    public int maxRob(int i , int amount , int n , int[] nums ,int[] dp){
        if(i >= n)return amount;

        if(dp[i] != -1)return dp[i];

        int pick = nums[i] + maxRob(i+2 , amount , n , nums , dp);

        int skip = maxRob(i+1 , amount , n , nums , dp);

        return dp[i] = Math.max(pick , skip);
    }
}