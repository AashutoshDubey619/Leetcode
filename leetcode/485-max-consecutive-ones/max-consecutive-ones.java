class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_ones = 0;

        int i = 0;
        int j = 0;

        while(nums[i] != 1){
            if(i == nums.length-1 && nums[i] == 0)return 0;
            if(i == nums.length-1 && nums[i] == 1)return 1;
            i++;
        }

        if(nums.length == 1 && nums[0] == 0)return 0;
        else if(nums.length == 1 && nums[0] == 1)return 1;
        
        max_ones = 1 ;
        j = i + 1;

        while(j < nums.length){
            if(nums[j] != 1){
                max_ones = Math.max(max_ones , j - i);
                i = j;
                while(i < nums.length && nums[i] != 1){
                    i++;
                    if(i > nums.length)return max_ones;
                }
                j = i;
            }
            max_ones = Math.max(max_ones , j - i + 1);
            j++;
        }

        return max_ones;
    }
}