class Solution {

    class Pair {
        int row;
        int col;

        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    public int maxAreaOfIsland(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        int max_area = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if(grid[i][j] == 1 && !visited[i][j]){
                    int area = bfs(i, j, grid, visited);
                    max_area = Math.max(max_area, area);
                }

            }
        }

        return max_area;
    }

    public int bfs(int i, int j, int[][] grid, boolean[][] visited){

        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));

        visited[i][j] = true;

        int area = 0;

        while(!q.isEmpty()){

            Pair p = q.poll();
            int row = p.row;
            int col = p.col;

            area++;

            if(row > 0 && grid[row-1][col] == 1 && !visited[row-1][col]){
                visited[row-1][col] = true;
                q.add(new Pair(row-1, col));
            }

            if(row < m-1 && grid[row+1][col] == 1 && !visited[row+1][col]){
                visited[row+1][col] = true;
                q.add(new Pair(row+1, col));
            }

            if(col > 0 && grid[row][col-1] == 1 && !visited[row][col-1]){
                visited[row][col-1] = true;
                q.add(new Pair(row, col-1));
            }

            if(col < n-1 && grid[row][col+1] == 1 && !visited[row][col+1]){
                visited[row][col+1] = true;
                q.add(new Pair(row, col+1));
            }
        }

        return area;
    }
}