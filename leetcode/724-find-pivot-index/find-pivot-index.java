class Solution {
    public int pivotIndex(int[] nums) {
        
        int suffsum = 0;

        int[] suffixsum = new int[nums.length];

        for(int i=nums.length-1;i>=0;i--){
            suffsum += nums[i];
            suffixsum[i] = suffsum;
        }

        int presum = 0;

        for(int i=0;i<nums.length;i++){
            presum += nums[i];

            if(presum == suffixsum[i])return i;
        }

        return -1;
    }
}