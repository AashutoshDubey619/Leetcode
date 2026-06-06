class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {

        long[][] dp = new long[nums.size()][target + 1];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        long ans = findLen(0, nums, target, dp);

        return ans == Integer.MIN_VALUE ? -1 : (int) ans;
    }

    public long findLen(int i, List<Integer> nums, int target, long[][] dp) {

        if (i == nums.size()) {
            return target == 0 ? 0 : Integer.MIN_VALUE;
        }

        if (dp[i][target] != -1) {
            return dp[i][target];
        }

        long skip = findLen(i + 1, nums, target, dp);

        if (target < nums.get(i)) {
            return dp[i][target] = skip;
        }

        long child = findLen(i + 1, nums, target - nums.get(i), dp);

        long pick = Integer.MIN_VALUE;

        if (child != Integer.MIN_VALUE) {
            pick = 1 + child;
        }

        return dp[i][target] = Math.max(skip, pick);
    }
}