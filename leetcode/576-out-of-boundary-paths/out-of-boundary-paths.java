class Solution {

    static final int MOD = 1000000007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {

        long[][][] dp = new long[m][n][maxMove + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return (int) paths(startRow, startColumn, m, n, maxMove, dp);
    }

    public long paths(int i, int j, int m, int n, int maxMove, long[][][] dp) {

        if (i < 0 || j < 0 || i >= m || j >= n)return 1;

        if (maxMove == 0)return 0;

        if (dp[i][j][maxMove] != -1)return dp[i][j][maxMove];

        long up = paths(i - 1, j, m, n, maxMove - 1, dp);
        long down = paths(i + 1, j, m, n, maxMove - 1, dp);
        long left = paths(i, j - 1, m, n, maxMove - 1, dp);
        long right = paths(i, j + 1, m, n, maxMove - 1, dp);

        return dp[i][j][maxMove] = (up + down + left + right) % MOD;
    }
}