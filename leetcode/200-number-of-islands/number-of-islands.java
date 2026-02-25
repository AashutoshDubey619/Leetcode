class Solution {
    public class Pair{
        int first;
        int second;

        Pair(int first , int second){
            this.first = first;
            this.second = second;
        }
    }


    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] =='1' && visited[i][j] == false){
                    visited[i][j] = true;
                    count++;
                    bfs(i , j , grid, visited);
                }
            }
        }
        return count;
    
    }
    public void bfs(int i , int j ,char[][] grid , boolean[][] visited ){
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        q.add(new Pair(i,j));

        while(q.size() > 0){
            Pair p = q.poll();
            int r = p.first;
            int c = p.second;

            if(r < n - 1 &&  grid[r+1][c] == '1' && visited[r+1][c] == false){
                q.add(new Pair(r+1 , c));
                visited[r+1][c] = true;
            }
            if(r > 0 &&  grid[r-1][c] == '1' && visited[r-1][c] == false){
                q.add(new Pair(r-1 , c));
                visited[r-1][c] = true;
            }
            if(c < m - 1  &&  grid[r][c+1] == '1' && visited[r][c+1] == false){
                q.add(new Pair(r , c+1));
                visited[r][c+1] = true;
            }
            if(c > 0 &&  grid[r][c-1] == '1' && visited[r][c-1] == false){
                q.add(new Pair(r , c-1));
                visited[r][c-1] = true;
            }
        }
        
    }
}