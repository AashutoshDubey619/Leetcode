class Solution {
    class Pair{
        int row , col;

        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }


    long num = 0;

    public int countIslands(int[][] grid, int k) {
        
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] != 0 && !vis[i][j]){
                    bfs(i , j , grid , vis , k);
                }
            }
        }

        return (int)num;
    }

    public void bfs(int i , int j , int[][] grid , boolean[][] vis , int k){
        vis[i][j] = true;

        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(i , j));

        long sum = 0;

        while(!q.isEmpty()){
            Pair p = q.poll();
            int row = p.row , col = p.col;
            
             sum += grid[row][col];

            if(row > 0 && !vis[row-1][col] && grid[row-1][col] != 0){
                q.add(new Pair(row-1 , col));
                vis[row-1][col] = true;
            }

            if(row < m-1 && !vis[row+1][col] && grid[row+1][col] != 0){
                q.add(new Pair(row+1 , col));
                vis[row+1][col] = true;
            }

            if(col > 0 && !vis[row][col-1] && grid[row][col-1] != 0){
                q.add(new Pair(row , col-1));
                vis[row][col-1] = true;
            }

            if(col < n-1 && !vis[row][col+1] && grid[row][col+1] != 0){
                q.add(new Pair(row , col+1));
                vis[row][col+1] = true;
            }

        }

        if(sum % k == 0)num++;
    }
}