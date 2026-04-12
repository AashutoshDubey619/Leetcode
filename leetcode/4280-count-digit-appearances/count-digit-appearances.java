class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        
        int count = 0;

        for(int i=0;i<nums.length;i++){
            while(nums[i] > 0){
                int dig = nums[i] % 10;
                if(dig == digit)count++;
                nums[i] /= 10;
            }
        }

        return count;
    }
}