class Solution {
    public int minOperations(int[] nums, int k) {
        
        int total_sum = 0;

        for(int n : nums)total_sum += n;        
        return total_sum % k;
    }
}