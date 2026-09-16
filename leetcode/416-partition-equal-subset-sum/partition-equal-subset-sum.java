class Solution {
    public boolean canPartition(int[] nums) {
        
        int target = 0;
        int n = nums.length;

        for(int i=0;i<n;i++)target += nums[i];

        if(target % 2 != 0)return false;

        int[][] dp = new int[n+1][target];

        for(int[] d : dp)Arrays.fill(d , -1);

        if(part(0 , target/2 , n , nums , dp)==0)return false;
        return true;
    }

    public int part(int i , int target , int n , int[] nums ,int[][] dp){
        if(i == nums.length){
            if(target == 0)return 1;
            else return 0;
        }

        boolean pick = false , skip = false;

        if(dp[i][target] != -1)return dp[i][target];

        if(part(i + 1 , target , n , nums , dp) == 1)skip = true;

        if(target < nums[i]){
            if(skip == true)return 1;
            else return 0;
        };

        if(part(i + 1 , target - nums[i] , n , nums , dp)==1)pick = true;
         
        boolean ans = pick || skip;

        if(ans)return dp[i][target] = 1;
        else return dp[i][target] = 0;
    }
}