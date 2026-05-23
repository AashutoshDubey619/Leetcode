class Solution {

    int count = 0;

    boolean[][] vis1;

    public int countSubIslands(int[][] grid1, int[][] grid2) {

        int m = grid1.length;
        int n = grid1[0].length;

        vis1 = new boolean[m][n];
        boolean[][] vis2 = new boolean[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                if(!vis1[i][j] && grid1[i][j] == 1) {
                    bfs(i, j, vis1, grid1, 1);
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                if(!vis2[i][j] && grid2[i][j] == 1) {
                    bfs(i, j, vis2, grid2, 2);
                }
            }
        }

        return count;
    }

    public void bfs(int i, int j, boolean[][] vis, int[][] grid, int version) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<Integer> q = new ArrayDeque<>();

        boolean flag = true;

        q.offer(i * n + j);

        vis[i][j] = true;

        while(!q.isEmpty()) {

            int cell = q.poll();

            int row = cell / n;
            int col = cell % n;

            if(version == 2 && !vis1[row][col]) {
                flag = false;
            }

            if(row > 0 && !vis[row - 1][col] && grid[row - 1][col] == 1) {

                vis[row - 1][col] = true;
                q.offer((row - 1) * n + col);
            }

            if(row < m - 1 && !vis[row + 1][col] && grid[row + 1][col] == 1) {

                vis[row + 1][col] = true;
                q.offer((row + 1) * n + col);
            }

            if(col > 0 && !vis[row][col - 1] && grid[row][col - 1] == 1) {

                vis[row][col - 1] = true;
                q.offer(row * n + (col - 1));
            }

            if(col < n - 1 && !vis[row][col + 1] && grid[row][col + 1] == 1) {

                vis[row][col + 1] = true;
                q.offer(row * n + (col + 1));
            }
        }

        if(version == 2 && flag) {
            count++;
        }
    }
}