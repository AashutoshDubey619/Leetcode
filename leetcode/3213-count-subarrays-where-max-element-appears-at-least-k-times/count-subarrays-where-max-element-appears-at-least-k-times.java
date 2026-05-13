class Solution {
    public long countSubarrays(int[] nums, int k) {

        long max_el = 0;
        long freq = 0;
        long count = 0;
        long n = nums.length;

        for(long x : nums){
            max_el = Math.max(max_el , x);
        }

        int i = 0;
        int j = 0;

        while(j < nums.length){
            if(nums[j] == max_el)freq++;

            while(freq >= k){
                count += n - j;
                if(nums[i] == max_el)freq--;
                i++;
            }

            j++;
        }

        return (long)count;
    }
}