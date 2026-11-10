class Solution {
    public int climbStairs(int n, int[] costs) {

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        return minCost(0, costs, n, dp);
    }

    public int minCost(int i, int[] costs, int n, int[] dp) {

        if(i == n)
            return 0;

        if(dp[i] != -1)
            return dp[i];

        int onestep = Integer.MAX_VALUE;
        int twostep = Integer.MAX_VALUE;
        int threestep = Integer.MAX_VALUE;

        if(i < n)
            onestep = costs[i] + 1 * 1
                    + minCost(i + 1, costs, n, dp);

        if(i < n - 1)
            twostep = costs[i + 1] + 2 * 2
                    + minCost(i + 2, costs, n, dp);

        if(i < n - 2)
            threestep = costs[i + 2] + 3 * 3
                    + minCost(i + 3, costs, n, dp);

        return dp[i] = Math.min(onestep,
                Math.min(twostep, threestep));
    }
}