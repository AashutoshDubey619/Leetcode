class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;

        boolean flag = true;
        for(int x : nums){
            if(x > 0){
                flag = false;
                break;
            }
        }

        int max_neg = Integer.MIN_VALUE;

        if(flag){
            for(int x : nums){
                max_neg = Math.max(max_neg , x);
            }
            return max_neg;
        }


        for(int x : nums){
            sum += x;

            if(sum < 0)sum = 0;

            max_sum = Math.max(sum , max_sum);
        }

        return max_sum;
    }
}