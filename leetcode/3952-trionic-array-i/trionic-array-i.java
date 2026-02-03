class Solution {
    public boolean isTrionic(int[] nums) {
        
        int p = 0;
        int q = 0;
        int j = 0;

            while(p < nums.length - 1  && nums[p] < nums[p+1]){
                p++; 
            }

            if(p == 0) return false;
            if(p < nums.length -1 && nums[p+1] >= nums[p]) return false;
            if(p == nums.length) return false;
            q = p + 1;

            while(q < nums.length - 1 && nums[q]<nums[q-1] && nums[q] > nums[q+1]){
                q++;
            }

            if(q < nums.length -1 && nums[q+1] <= nums[q]) return false;
            if(q == nums.length-1) return false;

            j = q+1;
         
            while(j < nums.length - 1  && nums[j] > nums[j-1] && nums[j] < nums[j+1]){
                j++;
            } 
        
        return j == nums.length-1;
    }
}