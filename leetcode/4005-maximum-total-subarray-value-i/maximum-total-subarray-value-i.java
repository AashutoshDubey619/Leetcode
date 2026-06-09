class Solution {
    public long maxTotalValue(int[] nums, int k) {
        
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for(long x : nums){
            max = Math.max(max , x);
            min = Math.min(min , x);
        }

        return (max - min) * k;
    }
}