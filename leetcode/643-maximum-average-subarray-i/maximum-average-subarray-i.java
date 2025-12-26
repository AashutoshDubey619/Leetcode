class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0;

        if (nums.length == 1) return nums[0];

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double max_avg = sum / k;   

        int i = 0;
        int j = k;

        while (j < nums.length) {
            sum += nums[j];
            sum -= nums[i];

            max_avg = Math.max(max_avg, sum / k);
            j++;
            i++;
        }

        return max_avg;
    }
}
