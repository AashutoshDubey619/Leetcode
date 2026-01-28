class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int[] ans = new int[nums.length];
        int[] lsum = new int[nums.length];
        int[] rsum = new int[nums.length];
        
        int leftsum = nums[0];
        int rightsum = nums[nums.length-1];

        
        for(int i=1;i<nums.length;i++){
           lsum[i] = leftsum;
           leftsum += nums[i];
        }

        for(int i=nums.length-2;i>=0;i--){
           rsum[i] = rightsum;
           rightsum += nums[i];
        }

       for(int i=0;i<nums.length;i++){
        ans[i] = Math.abs(lsum[i] - rsum[i]);
       }

        return ans;
    }
}