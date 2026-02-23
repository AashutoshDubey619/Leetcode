class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int [] res = new int[nums.length];
        
        
        int x = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] < pivot){
                res[x] = nums[i];
                x++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] == pivot){
                res[x] = nums[i];
                x++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] > pivot){
                res[x] = nums[i];
                x++;
            }
        }

        return res;
    }
}