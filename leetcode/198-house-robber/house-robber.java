class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return rob_max(n-1, nums, dp);
    }

    public int rob_max(int idx, int[] nums, int[] dp){
        if(idx == 0) return nums[0];
        if(idx < 0) return 0;

        if(dp[idx] != -1) return dp[idx];

        int take = nums[idx] + rob_max(idx-2, nums, dp);
        int skip = rob_max(idx-1, nums, dp);

        return dp[idx] = Math.max(take, skip);
    }
}