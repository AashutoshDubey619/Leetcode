class Solution {
    public int longestSubarray(int[] nums) {
        
        int max_len = 0;
        
        int i  = 0;
        int j = 0;
        int zeroes = 0;

        while(j < nums.length){
            
            if(nums[j] == 0)zeroes++;

            while(zeroes > 1){
                if(nums[i] == 0)zeroes--;
                i++;
            }

            max_len = Math.max(max_len , j - i + 1);

            j++;
        }

        return max_len - 1;
    }
}