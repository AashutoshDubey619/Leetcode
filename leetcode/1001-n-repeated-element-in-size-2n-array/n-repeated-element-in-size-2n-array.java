class Solution {
    public int repeatedNTimes(int[] nums) {
        
        int freq[] = new int[100000];
        int max_idx = 0;

        for(int i=0;i<nums.length;i++){
            max_idx = Math.max(nums[i] , max_idx);
            freq[nums[i]]++;
        }

        for(int i=0;i<max_idx+1;i++){
            if(freq[i] == (nums.length/2)){
                return i;
            }
        }

        return -1;
    }
}