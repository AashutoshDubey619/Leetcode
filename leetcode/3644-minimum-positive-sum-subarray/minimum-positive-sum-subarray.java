class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        
        int min_sum = Integer.MAX_VALUE;

        for(int i=0;i<nums.size();i++){
            int sum = 0;
            for(int j=i;j<nums.size();j++){
                sum += nums.get(j);

                int len = j-i+1;

                if(sum > 0 && len >= l && len <= r)min_sum = Math.min(min_sum , sum);
            }
        }

        return min_sum == Integer.MAX_VALUE ? -1 : min_sum;
    }
}