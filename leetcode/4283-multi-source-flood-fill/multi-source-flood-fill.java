class Solution {

    class Triplet{
        int row;
        int col;

        Triplet(int row , int col){
            this.row = row;
            this.col = col;
        }
    }

    public int[][] colorGrid(int n, int m, int[][] sources) {

        int[][] grid = new int[n][m];
        int[][] dist = new int[n][m];

        for(int i=0;i<n;i++){
            Arrays.fill(dist[i] , Integer.MAX_VALUE);
        }

        Queue<Triplet> q = new LinkedList<>();

        for(int[] s : sources){

            int row = s[0];
            int col = s[1];
            int color = s[2];

            grid[row][col] = color;
            dist[row][col] = 0;

            q.add(new Triplet(row , col));
        }

        while(!q.isEmpty()){

            Triplet t = q.poll();

            int row = t.row;
            int col = t.col;

            // UP
            if(row > 0){

                if(dist[row-1][col] > dist[row][col] + 1){

                    dist[row-1][col] = dist[row][col] + 1;

                    grid[row-1][col] = grid[row][col];

                    q.add(new Triplet(row-1 , col));
                }
                else if(dist[row-1][col] == dist[row][col] + 1){

                    grid[row-1][col] =
                        Math.max(grid[row-1][col] , grid[row][col]);
                }
            }

            // DOWN
            if(row < n-1){

                if(dist[row+1][col] > dist[row][col] + 1){

                    dist[row+1][col] = dist[row][col] + 1;

                    grid[row+1][col] = grid[row][col];

                    q.add(new Triplet(row+1 , col));
                }
                else if(dist[row+1][col] == dist[row][col] + 1){

                    grid[row+1][col] =
                        Math.max(grid[row+1][col] , grid[row][col]);
                }
            }

            // LEFT
            if(col > 0){

                if(dist[row][col-1] > dist[row][col] + 1){

                    dist[row][col-1] = dist[row][col] + 1;

                    grid[row][col-1] = grid[row][col];

                    q.add(new Triplet(row , col-1));
                }
                else if(dist[row][col-1] == dist[row][col] + 1){

                    grid[row][col-1] =
                        Math.max(grid[row][col-1] , grid[row][col]);
                }
            }

            // RIGHT
            if(col < m-1){

                if(dist[row][col+1] > dist[row][col] + 1){

                    dist[row][col+1] = dist[row][col] + 1;

                    grid[row][col+1] = grid[row][col];

                    q.add(new Triplet(row , col+1));
                }
                else if(dist[row][col+1] == dist[row][col] + 1){

                    grid[row][col+1] =
                        Math.max(grid[row][col+1] , grid[row][col]);
                }
            }
        }

        return grid;
    }
}