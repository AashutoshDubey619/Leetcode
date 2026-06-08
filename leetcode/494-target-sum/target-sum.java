class Solution {
    int sum = 0;
    public int findTargetSumWays(int[] nums, int target) {
        
        for(int el : nums) sum += el; 

        int[][] dp = new int[nums.length][2*sum + 1];

        for(int d[] : dp)Arrays.fill(d , -1);

        return ways(0 , 0 , target , nums , dp);
    }

    public int ways(int i , int x , int target , int[] nums , int[][] dp){
        if(i == nums.length){
            if(x == target)return 1;
            else return 0;
        }

        if(dp[i][x+sum] != -1)return dp[i][x+sum];

        int add = ways(i+1 , x + nums[i] , target , nums , dp);
        int sub = ways(i+1 , x - nums[i] , target , nums , dp);

        return dp[i][x+sum] = add + sub;
    }
}