class Solution {
    public int minOperations(int[] nums, int k) {
        
        int total_sum = 0;

        for(int n : nums)total_sum += n;

        if(total_sum % k ==0) return 0;
        
        return total_sum % k;
    }
}