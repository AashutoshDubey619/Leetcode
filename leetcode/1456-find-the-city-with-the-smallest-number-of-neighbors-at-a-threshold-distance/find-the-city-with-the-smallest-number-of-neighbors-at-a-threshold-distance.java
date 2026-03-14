class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        
        int[][] dist = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j) dist[i][j] = 0;
                else dist[i][j] = Integer.MAX_VALUE;
            }
        }

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            dist[u][v] = edges[i][2];
            dist[v][u] = edges[i][2];
        }



        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE){
                        dist[i][j] = Math.min(dist[i][j] , dist[i][k] + dist[k][j]);
                    }
                }
            }
        }


        int min = Integer.MAX_VALUE;
        int city = -1;
        

        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(i != j && dist[i][j] <= distanceThreshold) count++;
            }
            if(count <= min){
                min = count;
                city = i;
            }
        }
        
        return city;
    }
}