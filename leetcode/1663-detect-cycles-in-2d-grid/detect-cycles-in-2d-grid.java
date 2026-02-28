class Solution {

    public class Node {
        int row, col, prow, pcol;

        Node(int row, int col, int prow, int pcol) {
            this.row = row;
            this.col = col;
            this.prow = prow;  
            this.pcol = pcol;   
        }
    }

    public boolean containsCycle(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!visited[i][j]){
                    if(bfs(i, j, grid, visited))
                        return true;
                }
            }
        }

        return false;
    }

    public boolean bfs(int i, int j, char[][] grid, boolean[][] visited){

        int n = grid.length;
        int m = grid[0].length;

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(i, j, -1, -1));
        visited[i][j] = true;

        while(!q.isEmpty()){

            Node curr = q.poll();
            int row = curr.row;
            int col = curr.col;

            
            if(row > 0 && grid[row-1][col] == grid[row][col]){
                if(!visited[row-1][col]){
                    visited[row-1][col] = true;
                    q.add(new Node(row-1, col, row, col));
                }
                else if(row-1 != curr.prow || col != curr.pcol){
                    return true;
                }
            }

            
            if(row < n-1 && grid[row+1][col] == grid[row][col]){
                if(!visited[row+1][col]){
                    visited[row+1][col] = true;
                    q.add(new Node(row+1, col, row, col));
                }
                else if(row+1 != curr.prow || col != curr.pcol){
                    return true;
                }
            }

          
            if(col > 0 && grid[row][col-1] == grid[row][col]){
                if(!visited[row][col-1]){
                    visited[row][col-1] = true;
                    q.add(new Node(row, col-1, row, col));
                }
                else if(row != curr.prow || col-1 != curr.pcol){
                    return true;
                }
            }

            
            if(col < m-1 && grid[row][col+1] == grid[row][col]){
                if(!visited[row][col+1]){
                    visited[row][col+1] = true;
                    q.add(new Node(row, col+1, row, col));
                }
                else if(row != curr.prow || col+1 != curr.pcol){
                    return true;
                }
            }
        }

        return false;
    }
}