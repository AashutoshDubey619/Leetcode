class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum = 0;

        for(int x : nums)sum += x;

        if(sum % 2 != 0)return false;

        int[][] dp = new int[nums.length][(sum/2)+1];

        for(int[] d : dp)Arrays.fill(d , -1);

        return subset(0 , nums , sum/2 , dp);
    }

    public boolean subset(int i , int[] nums , int target , int[][] dp){
        if(i == nums.length){
            if(target == 0)return true;
            else return false;
        }

        if(dp[i][target] != -1){
            if(dp[i][target] == 0)return true;
            else return false;
        }

        boolean skip = subset(i + 1 , nums , target , dp);
        
        if(target - nums[i] < 0)return skip;
      
        boolean pick = subset(i + 1 , nums , target - nums[i] , dp);
        
        boolean ans = pick || skip;

        if(ans){
            dp[i][target] = 0;
        }
        else dp[i][target] = 1;

        return ans;
    }
}