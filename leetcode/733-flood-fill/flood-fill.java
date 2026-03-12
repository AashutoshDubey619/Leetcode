class Solution {
    class Pair{
        int row;
        int col;

        Pair(int row , int col){
            this.row = row;
            this.col = col;
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        int org = image[sr][sc];

        if(org == color) return image;

        bfs(sr , sc ,color , org , image);

        return image;
    }

    public void bfs(int i , int j ,int color ,int org , int[][] image){

        int m = image.length;
        int n = image[0].length;

        image[i][j] = color;

        
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(i , j));

        while(q.size() > 0){
            Pair p = q.poll();

            int row = p.row , col = p.col;

            if(row > 0 && image[row-1][col]  == org){
                image[row - 1][col] = color;
                q.add(new Pair(row-1,col)); 
            }
            if(row < m - 1 && image[row+1][col]  == org){
                image[row + 1][col] = color;
                 q.add(new Pair(row+1,col));  
            }
            if(col > 0 && image[row][col-1]  == org){
                image[row][col-1] = color; 
                 q.add(new Pair(row,col-1)); 
            }
            if(col < n-1 && image[row][col+1]  == org){
                image[row][col + 1] = color; 
                 q.add(new Pair(row,col+1)); 
            }
        }

    }
}