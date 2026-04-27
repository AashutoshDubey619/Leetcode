class Solution {
    class Pair{
        int row , col;

        Pair(int row , int col){
            this.row = row;
            this.col = col;
        }
    }
    public boolean hasValidPath(int[][] grid) {
        
        Queue<Pair> q = new LinkedList<>();

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];

        vis[0][0] = true;
        q.add(new Pair(0 , 0));

        while(!q.isEmpty()){
            Pair p = q.poll();

            int row = p.row , col = p.col;

            if(row == m-1 && col == n-1)return true;
            
            
            if(grid[row][col]==1){
                if(col>0 && !vis[row][col-1] && (grid[row][col-1] == 1 || grid[row][col-1] == 4 ||  grid[row][col-1] == 6)){
                    q.add(new Pair(row , col-1));
                    vis[row][col-1] = true;
                }
                if(col<n-1 && !vis[row][col+1] && (grid[row][col+1] == 1 || grid[row][col+1] == 3 ||  grid[row][col+1] == 5)){
                    q.add(new Pair(row , col+1));
                    vis[row][col+1] = true;
                }
            }
            else if(grid[row][col] == 2){
                if(row>0 && !vis[row-1][col] && (grid[row-1][col] == 2 || grid[row-1][col] == 3 ||  grid[row-1][col] == 4)){
                    q.add(new Pair(row -1, col));
                    vis[row-1][col] = true;
                }
                if(row<m-1 && !vis[row+1][col] && (grid[row+1][col] == 2 || grid[row+1][col] == 5 ||  grid[row+1][col] == 6)){
                    q.add(new Pair(row +1, col));
                    vis[row+1][col] = true;
                }
            }
            else if(grid[row][col] == 3){
                if(col>0 && !vis[row][col-1] && (grid[row][col-1] == 1 ||  grid[row][col-1] == 4 ||grid[row][col-1] == 6 )){
                    q.add(new Pair(row , col-1));
                    vis[row][col-1] = true;
                }
                if(row<m-1 && !vis[row+1][col] && (grid[row+1][col] == 2 ||  grid[row+1][col] == 6 || grid[row+1][col] == 5 )){
                    q.add(new Pair(row +1, col));
                    vis[row+1][col] = true;
                }
            }
            else if(grid[row][col] == 4){
                if(row<m-1 && !vis[row+1][col] && (grid[row+1][col] == 2 ||  grid[row+1][col] == 6 || grid[row+1][col] == 5 )){
                    q.add(new Pair(row +1, col));
                    vis[row+1][col] = true;
                }
                if(col<n-1 && !vis[row][col+1] && (grid[row][col+1] == 1 ||  grid[row][col+1] == 3 ||grid[row][col+1] == 5 )){
                    q.add(new Pair(row , col+1));
                    vis[row][col+1] = true;
                }
            }
            else if(grid[row][col] == 5){
                if(col>0 && !vis[row][col-1] && (grid[row][col-1] == 1 ||  grid[row][col-1] == 4 ||grid[row][col-1] == 6 )){
                    q.add(new Pair(row , col-1));
                    vis[row][col-1] = true;
                }
               if(row>0 && !vis[row-1][col] && (grid[row-1][col] == 2 || grid[row-1][col] == 3 ||  grid[row-1][col] == 4)){
                    q.add(new Pair(row -1, col));
                    vis[row-1][col] = true;
                }
            }
            else if(grid[row][col] == 6){
                if(row>0 && !vis[row-1][col] && (grid[row-1][col] == 2 || grid[row-1][col] == 3 ||  grid[row-1][col] == 4)){
                    q.add(new Pair(row -1, col));
                    vis[row-1][col] = true;
                }
                if(col<n-1 && !vis[row][col+1] && (grid[row][col+1] == 1 ||  grid[row][col+1] == 3 ||grid[row][col+1] == 5 )){
                    q.add(new Pair(row , col+1));
                    vis[row][col+1] = true;
                }
            }
            
        }

        return false;
    }
}