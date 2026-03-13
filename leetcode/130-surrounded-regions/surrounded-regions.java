import java.util.*;

class Solution {

    class Pair{
        int row, col;

        Pair(int r, int c){
            row = r;
            col = c;
        }
    }

    public void solve(char[][] board) {

        int m = board.length;
        int n = board[0].length;

        
        for(int i = 0; i < m; i++){
            if(board[i][0] == 'O') bfs(i, 0, board);
            if(board[i][n-1] == 'O') bfs(i, n-1, board);
        }

        for(int j = 0; j < n; j++){
            if(board[0][j] == 'O') bfs(0, j, board);
            if(board[m-1][j] == 'O') bfs(m-1, j, board);
        }

        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                else if(board[i][j] == 'C') board[i][j] = 'O';
            }
        }
    }

    public void bfs(int i, int j, char[][] board){

        int m = board.length;
        int n = board[0].length;

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(i,j));
        board[i][j] = 'C';

        while(!q.isEmpty()){

            Pair p = q.poll();
            int row = p.row;
            int col = p.col;

            
            if(row > 0 && board[row-1][col] == 'O'){
                board[row-1][col] = 'C';
                q.add(new Pair(row-1, col));
            }

           
            if(row < m-1 && board[row+1][col] == 'O'){
                board[row+1][col] = 'C';
                q.add(new Pair(row+1, col));
            }

            
            if(col > 0 && board[row][col-1] == 'O'){
                board[row][col-1] = 'C';
                q.add(new Pair(row, col-1));
            }

            
            if(col < n-1 && board[row][col+1] == 'O'){
                board[row][col+1] = 'C';
                q.add(new Pair(row, col+1));
            }
        }
    }
}