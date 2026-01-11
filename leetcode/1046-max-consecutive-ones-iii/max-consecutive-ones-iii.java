class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int i = 0;
        int j = 0;
        int max_len = 0;

        int[] freq = new int[2];

        while(j < nums.length){
            freq[nums[j]]++;

            while(nums[j] == 0 && freq[nums[j]] > k){
                freq[nums[i]]--;
                i++;
            }

            max_len = Math.max(max_len , j - i + 1);
            j++;
        }

        return max_len;
    }
}