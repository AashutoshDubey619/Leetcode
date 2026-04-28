class Solution {
    class Pair{
        int row , col ;

        Pair(int row , int col){
            this.row = row;
            this.col = col;
        }
    }

    public int[][] findFarmland(int[][] land) {
        
        int m = land.length;
        int n = land[0].length;

        boolean[][] vis = new boolean[m][n];

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && land[i][j] == 1){
                    bfs(i , j , vis , land , list);
                }
            }
        }

        int[][] res = new int[list.size()][4];
        
        for(int i=0;i<list.size();i++){
            for(int j=0;j<4;j++){
                res[i][j] = list.get(i).get(j);
            }
        }

        return res;
    }

    public void bfs(int i , int j ,boolean[][] vis , int[][] land , ArrayList<ArrayList<Integer>> list){
        int m = land.length;
        int n = land[0].length;

        vis[i][j] = true;

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(i , j));

        list.add(new ArrayList<>());
        list.get(list.size()-1).add(i); 
        list.get(list.size()-1).add(j); 

        int max_r = -1 , max_c = -1;

        while(!q.isEmpty()){
            Pair p = q.poll();

            int row = p.row , col = p.col;

            max_r = Math.max(max_r , row);
            max_c = Math.max(max_c , col);

            if(row > 0 && !vis[row-1][col] && land[row-1][col] == 1){
                q.add(new Pair(row-1,col));
                vis[row-1][col] = true;
            }
            if(row < m-1 && !vis[row+1][col] && land[row+1][col] == 1){
                q.add(new Pair(row+1,col));
                vis[row+1][col] = true;
            }

            if(col > 0 && !vis[row][col-1] && land[row][col-1] == 1){
                q.add(new Pair(row,col-1));
                vis[row][col-1] = true;
            }
            if(col < n-1 && !vis[row][col+1] && land[row][col+1] == 1){
                q.add(new Pair(row,col+1));
                vis[row][col+1] = true;
            }
        }

        list.get(list.size()-1).add(max_r); 
        list.get(list.size()-1).add(max_c); 
    }
}