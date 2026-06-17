class Solution {
    public long rob(int[] nums, int[] colors) {
        long[] dp = new long[nums.length];
        Arrays.fill(dp, -1);
        return solve(0, nums, colors, dp);
    }

    private long solve(int i, int[] nums, int[] colors, long[] dp) {
        if (i >= nums.length) return 0;

        if (dp[i] != -1) return dp[i];

        long skip = solve(i + 1, nums, colors, dp);

        long pick;
        if (i < nums.length - 1 && colors[i] == colors[i + 1]) {
            pick = nums[i] + solve(i + 2, nums, colors, dp);
        } else {
            pick = nums[i] + solve(i + 1, nums, colors, dp);
        }

        return dp[i] = Math.max(pick, skip);
    }
}