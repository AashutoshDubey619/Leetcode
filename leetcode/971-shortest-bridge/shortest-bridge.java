class Solution {

    class Pair{
        int row, col;

        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    public int shortestBridge(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();

        boolean found = false;

        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    bfsIsland(i,j,grid,vis,q);
                    found = true;
                    break;
                }
            }
            if(found) break;
        }

        int steps = 0;

        while(!q.isEmpty()){

            int size = q.size();

            for(int s=0;s<size;s++){

                Pair p = q.poll();
                int row = p.row;
                int col = p.col;

                
                if(row > 0 && !vis[row-1][col]){
                    if(grid[row-1][col] == 1) return steps;
                    vis[row-1][col] = true;
                    q.add(new Pair(row-1,col));
                }

                
                if(row < m-1 && !vis[row+1][col]){
                    if(grid[row+1][col] == 1) return steps;
                    vis[row+1][col] = true;
                    q.add(new Pair(row+1,col));
                }

                
                if(col > 0 && !vis[row][col-1]){
                    if(grid[row][col-1] == 1) return steps;
                    vis[row][col-1] = true;
                    q.add(new Pair(row,col-1));
                }

                
                if(col < n-1 && !vis[row][col+1]){
                    if(grid[row][col+1] == 1) return steps;
                    vis[row][col+1] = true;
                    q.add(new Pair(row,col+1));
                }
            }

            steps++;
        }

        return -1;
    }

    
    public void bfsIsland(int i,int j,int[][] grid,boolean[][] vis,Queue<Pair> q){

        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> temp = new LinkedList<>();
        temp.add(new Pair(i,j));

        vis[i][j] = true;
        q.add(new Pair(i,j));

        while(!temp.isEmpty()){

            Pair p = temp.poll();
            int row = p.row;
            int col = p.col;

            if(row > 0 && grid[row-1][col] == 1 && !vis[row-1][col]){
                vis[row-1][col] = true;
                temp.add(new Pair(row-1,col));
                q.add(new Pair(row-1,col));
            }

            if(row < m-1 && grid[row+1][col] == 1 && !vis[row+1][col]){
                vis[row+1][col] = true;
                temp.add(new Pair(row+1,col));
                q.add(new Pair(row+1,col));
            }

            if(col > 0 && grid[row][col-1] == 1 && !vis[row][col-1]){
                vis[row][col-1] = true;
                temp.add(new Pair(row,col-1));
                q.add(new Pair(row,col-1));
            }

            if(col < n-1 && grid[row][col+1] == 1 && !vis[row][col+1]){
                vis[row][col+1] = true;
                temp.add(new Pair(row,col+1));
                q.add(new Pair(row,col+1));
            }
        }
    }
}