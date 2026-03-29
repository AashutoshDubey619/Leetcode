class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int[] ans = new int[2];

        for(int i = 0; i < nums.length; i++){
            int idx = Math.abs(nums[i]) - 1;

            if(nums[idx] > 0){
                nums[idx] *= -1;
            } else {
                ans[0] = Math.abs(nums[i]); 
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans[1] = i + 1; 
            }
        }

        return ans;
    }
}