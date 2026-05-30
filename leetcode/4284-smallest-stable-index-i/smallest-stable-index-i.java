class Solution {
    public int firstStableIndex(int[] nums, int k) {
         int[] pmax = new int[nums.length];
        int[] smin = new int[nums.length];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }    
            pmax[i] = max;
        }

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] < min){
                min = nums[i];
            }    
            smin[i] = min;
        }

        for(int i=0;i<nums.length;i++){
            if(pmax[i] - smin[i] <= k)return i;
        }

        return -1;
    }
}