class Solution {
    int total_sum = 0;

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;

        for(int x : nums)sum += x;

        total_sum = sum;

        int[][] dp = new int[nums.length][(2*sum)+1];

        for(int d[] : dp)Arrays.fill(d , -1);

        return ways(0 , 0 , nums  , target , dp);
    }

    public int ways(int i ,int sum ,  int[] nums , int target , int[][] dp){
        if(i == nums.length){
            if(target == sum)return 1;
            else return 0;
        }

        if(dp[i][total_sum+sum] != -1)return dp[i][total_sum+sum];

        int sub = ways(i+1 ,sum - nums[i] , nums , target , dp);
        int add = ways(i+1 , sum + nums[i] ,nums , target , dp);

        return dp[i][total_sum+sum] = add + sub ;
    }
}