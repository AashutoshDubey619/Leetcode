class Solution {
    class Triplet {
        int row, col, step;

        Triplet(int row, int col, int step) {
            this.row = row;
            this.col = col;
            this.step = step;
        }
    }

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;

        boolean[][] vis = new boolean[m][n];

        return bfs(entrance[0], entrance[1], vis, maze, entrance);
    }

    public int bfs(int i, int j, boolean[][] vis, char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;

        Queue<Triplet> q = new LinkedList<>();
        q.add(new Triplet(i, j, 0));

        vis[i][j] = true;

        while (!q.isEmpty()) {
            Triplet t = q.poll();

            int row = t.row, col = t.col, step = t.step;

            if ((row == 0 || col == 0 || row == m - 1 || col == n - 1) &&
                !(row == entrance[0] && col == entrance[1])) {
                return step;
            }

            if (row > 0 && maze[row - 1][col] == '.' && !vis[row - 1][col]) {
                vis[row - 1][col] = true;
                q.add(new Triplet(row - 1, col, step + 1));
            }

            if (row < m - 1 && maze[row + 1][col] == '.' && !vis[row + 1][col]) {
                vis[row + 1][col] = true;
                q.add(new Triplet(row + 1, col, step + 1));
            }

            if (col > 0 && maze[row][col - 1] == '.' && !vis[row][col - 1]) {
                vis[row][col - 1] = true;
                q.add(new Triplet(row, col - 1, step + 1));
            }

            if (col < n - 1 && maze[row][col + 1] == '.' && !vis[row][col + 1]) {
                vis[row][col + 1] = true;
                q.add(new Triplet(row, col + 1, step + 1));
            }
        }

        return -1;
    }
}