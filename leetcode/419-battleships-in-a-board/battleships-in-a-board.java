class Solution {
    class Pair{
        int row , col;

        Pair(int row , int col){
            this.row = row;
            this.col = col;
        }
    }


    public int countBattleships(char[][] board) {
        
        int m = board.length;
        int n = board[0].length;
        
        boolean vis [][] = new boolean[m][n];
        int count = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && board[i][j] == 'X' ){
                    count++;
                    bfs(i , j , vis , board);
                }
            }
        }

        return count;
    }

    public void bfs(int i , int j , boolean[][] vis , char [][] board){
          
        int m = board.length;
        int n = board[0].length;
        vis[i][j] = true;

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(i , j));

        while(!q.isEmpty()){
            Pair p = q.poll();

            int row = p.row , col = p.col;

            if(row > 0 &&  !vis[row-1][col] && board[row-1][col] == 'X'){
                q.add(new Pair(row-1 , col));
                vis[row-1][col] = true;
            }

            if(row < m-1 &&  !vis[row+1][col] && board[row+1][col] == 'X'){
                q.add(new Pair(row+1 , col));
                vis[row+1][col] = true;
            }

            if(col > 0 &&  !vis[row][col-1] && board[row][col-1] == 'X'){
                q.add(new Pair(row , col-1));
                vis[row][col-1] = true;
            }

            if(col < n-1 &&  !vis[row][col+1] && board[row][col+1] == 'X'){
                q.add(new Pair(row , col+1));
                vis[row][col+1] = true;
            }
        }
    }
}