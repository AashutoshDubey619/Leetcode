class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for(int el : nums)sum += el;

        if(sum % 2 != 0)return false;

        int[][] dp = new int[nums.length][sum/2 + 1];

        for(int i=0;i<dp.length;i++)Arrays.fill(dp[i] , -1);

        return subset(0 , sum/2 , dp , nums);
    }

    public boolean subset(int i , int target , int[][] dp , int[] nums){
        if(i == nums.length){
            return target == 0;
        }

        if(dp[i][target] != -1){
            return dp[i][target] == 1;
        }

        boolean skip = subset(i + 1 , target , dp , nums);

        boolean ans = false;

        if(target - nums[i] < 0){
            if(skip)dp[i][target] = 1;
            else dp[i][target] = 0;
            return skip;
        }
        else{
            boolean pick = subset(i+1 , target - nums[i] , dp , nums);
            ans = pick || skip;
        }
        
        if(ans)dp[i][target] = 1;
        else dp[i][target] = 0;

        return ans;
    }
}