class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        int dp[] = new int[n];

        if(n == 1)return nums[0];
        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0] , nums[1]);

        for(int i=2;i<n-1;i++){
            dp[i] = Math.max(nums[i] + dp[i-2] , dp[i-1]);
        }

        int max = dp[n-2];

        dp[n-1] = nums[n-1];
        dp[n-2] = Math.max(nums[n-1] , nums[n-2]);
        
        for(int i=n-3;i>=1;i--){
            dp[i] = Math.max(nums[i] + dp[i+2] , dp[i+1]);
        }

        max = Math.max(max , dp[1]);

        return max;
    }
}