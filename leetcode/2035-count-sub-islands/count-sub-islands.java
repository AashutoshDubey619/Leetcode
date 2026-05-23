class Solution {
    class Pair{
        int row , col;

        Pair(int row , int col){
            this.row = row;
            this.col = col;
        }
    }

    int count = 0;

    boolean[][] vis1;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        
        int m = grid1.length;
        int n = grid1[0].length;

        vis1 = new boolean[m][n];
        boolean[][] vis2 = new boolean[m][n];


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis1[i][j] && grid1[i][j] == 1){
                    bfs(i , j , vis1 , grid1 , 1);
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis2[i][j] && grid2[i][j] == 1){
                    bfs(i , j , vis2 , grid2 , 2);
                }
            }
        }

        
        return count;

    }

    public void bfs(int i , int j , boolean[][] vis , int[][] grid , int version){
        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        boolean flag = true;
        
        q.add(new Pair(i , j));

        vis[i][j] = true;

        while(!q.isEmpty()){
            Pair p = q.poll();
            int row = p.row , col = p.col;

            if(version == 2 && !vis1[row][col]){
                flag = false;
            }


            if(row > 0 && !vis[row-1][col] && grid[row-1][col] == 1){
                q.add(new Pair(row-1 , col));
                vis[row-1][col] = true;
            }
            if(row < m-1 && !vis[row+1][col] && grid[row+1][col] == 1){
                 q.add(new Pair(row+1 , col));
                 vis[row+1][col] = true;
            }

            if(col > 0 && !vis[row][col-1] && grid[row][col-1] == 1){
                q.add(new Pair(row , col-1));
                vis[row][col-1] = true;
            }
            if(col < n-1 && !vis[row][col+1] && grid[row][col+1] == 1){
                 q.add(new Pair(row , col+1));
                 vis[row][col+1] = true;
            }
        }

        if(version == 2 && flag) count++;
    }
    
}