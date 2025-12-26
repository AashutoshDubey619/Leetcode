class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int i = 0;
        int j = 0;
        int count = 0;
        int max_count = count;

        if(nums.length == 1 && nums[0] == 0) return 0;  
        
        while(j < nums.length){
            if(nums[j] == 0){
                i = j + 1;
                count = 0;
                j++;
            }
            else{
            count++;
            max_count = Math.max(count , max_count);
            j++;
            }
        }
        
        return max_count;

    }
}