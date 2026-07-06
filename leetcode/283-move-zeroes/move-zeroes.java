class Solution {
    public void moveZeroes(int[] nums) {
        
        int i = 0;

        while(i < nums.length && nums[i] != 0)i++;

        if(i == nums.length)return;

        int j = i + 1;

        while(j < nums.length){
            if(nums[j] != 0){
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
            j++;
        }
        
    }
}