class Solution {
    public int maxProduct(int[] nums) {
        
         int num1 = -1;
         int num2 = -1;
         int maxP = -1;

         for(int i=0;i<nums.length;i++){
            if(nums[i] >= num1){
                num2 = num1;
                num1 = nums[i];
            }
            if(nums[i] >= num2 && nums[i] < num1)num2 = nums[i];
            maxP = Math.max(maxP , (num1-1)*(num2-1));
         }

         return maxP;     
    }
}