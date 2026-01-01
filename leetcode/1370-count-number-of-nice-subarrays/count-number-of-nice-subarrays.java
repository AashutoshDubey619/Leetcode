class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return AtMost(nums , k) - AtMost(nums, k-1);
    }
    
    private int AtMost(int[] nums , int k){
        int i = 0;
        int count = 0;
        int oddcount = 0;

        for(int j=0;j<nums.length;j++){
            if(nums[j] % 2 != 0) oddcount++;

            while(oddcount > k){
                if(nums[i] % 2 != 0) oddcount--;
                i++;
            }

            count += j - i + 1;
        }

        return count;
    }
}