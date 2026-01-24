class Solution {
    public int minPairSum(int[] nums) {
        
        int min_pair = Integer.MIN_VALUE;


        Arrays.sort(nums);

        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            min_pair = Math.max(min_pair , (nums[l] + nums[r]));

            l++;
            r--;
        }

    return min_pair;

    }
}