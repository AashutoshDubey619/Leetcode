class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] degree = new int[n];
        boolean[][] connection = new boolean[n][n];

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            degree[u]++;
            degree[v]++;
            connection[u][v] = true;
            connection[v][u] = true; 
        }

        int rank = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int currentRank = degree[i] + degree[j];
                
                if (connection[i][j]) {
                    currentRank--;
                }

                rank = Math.max(rank, currentRank);
            }
        }

        return rank;
    }
}